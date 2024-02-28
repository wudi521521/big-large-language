package count;

import org.apache.commons.io.FileUtils;
import org.apache.storm.Config;
import org.apache.storm.LocalCluster;
import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.TopologyBuilder;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.topology.base.BaseRichSpout;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;
import org.apache.storm.utils.Utils;

import java.io.File;
import java.util.*;

public class LocalWordStormTopology {

    /**
     * Spout需要继承BaseRichSpout
     * 数据源需要产生数据并发射
     */
    public static class DataSourceSpout extends BaseRichSpout {

        private SpoutOutputCollector collector;


        /**
         * 初始化方法，只会被调用一次
         *
         * @param map                  配置参数
         * @param topologyContext      上下文
         * @param spoutOutputCollector 数据发射器
         */
        @Override
        public void open(Map map, TopologyContext topologyContext, SpoutOutputCollector spoutOutputCollector) {
            this.collector = spoutOutputCollector;
        }

        /**
         * 业务
         * 1）读取指定目录的文件夹下的数据/Users/wudi/wudi/learn/big-large-language/wc
         * 2）把每一行数据发射出去
         */
        @Override
        public void nextTuple() {
            //获取所有文件
            Collection<File> files = FileUtils.listFiles(new File("/Users/wudi/wudi/learn/big-large-language/wc"),
                    new String[]{"txt"}, true);
            for (File file : files) {
                try {
                    //获取文件中的所有内容
                    List<String> lines = FileUtils.readLines(file);
                    //文件中的每行内容
                    for (String line : lines) {
                        this.collector.emit(new Values(line));
                    }
                    //单词发射以后，修改名称，否则，一直重复执行
                    FileUtils.moveFile(file,new File(file.getAbsolutePath()+System.currentTimeMillis()));
                } catch (Exception e) {
                }
            }

        }

        /**
         * 声明输出字段
         *
         * @param outputFieldsDeclarer
         */
        @Override
        public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {
            //定义一个名字
            outputFieldsDeclarer.declare(new Fields("line"));
        }
    }


    /**
     * 对数据分割
     */
    public static class SplitBolt extends BaseRichBolt {

        private OutputCollector collector;

        /**
         * 初始化方法，会被执行一次
         *
         * @param map
         * @param topologyContext
         * @param outputCollector
         */
        @Override
        public void prepare(Map map, TopologyContext topologyContext, OutputCollector outputCollector) {
            this.collector = outputCollector;
        }

        /**
         * 死循环，一直执行下去：获取Spout发送过来的数据
         * line:对line进行分割，按照逗号处理
         *
         * @param tuple
         */
        @Override
        public void execute(Tuple tuple) {
            //Bolt中获取值可以根据index取值，也可以根据一个环节中定义的field的名称获取（建议使用该方式）
            String line = tuple.getStringByField("line");
            String[] words = line.split(" ");
            //把单词发射出去
            for (String word : words) {
                this.collector.emit(new Values(word));
            }
        }

        /**
         * 定义属性
         * @param outputFieldsDeclarer
         */
        @Override
        public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {
             outputFieldsDeclarer.declare(new Fields("word"));
        }
    }


    /**
     * 词频汇总Bolt
     */
    public static class SumBolt extends BaseRichBolt{
        Map<String,Integer> map =  new HashMap<String,Integer>();


        @Override
        public void prepare(Map map, TopologyContext topologyContext, OutputCollector outputCollector) {

        }

        /**
         * 死循环，一直执行下去
         * 1）获取每个单词
         * 2）对所有单词进行汇总
         * 3）输出
         * @param tuple
         */
        @Override
        public void execute(Tuple tuple) {
            String word = tuple.getStringByField("word");
            Integer count =map.get(word);
            if (count == null){
                count =0;
            }else{
                count++;
            }
            map.put(word,count);
            System.out.println("-----------");
            Set<Map.Entry<String, Integer>> entries = map.entrySet();
            for (Map.Entry<String, Integer> entry : entries) {
                System.out.println(entry);
            }

        }


        @Override
        public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {

        }
    }

    public static void main(String[] args) {
        //TopologyBuilder根据Spout和Bolt来构建出Topology
        //Storm中任何一个作业都是通过Topology的方式进行提交的
        //Topology中需要指定Spout和Bolt的执行顺序
        TopologyBuilder builder = new TopologyBuilder();
        builder.setSpout("DataSourceSpout",new DataSourceSpout());
        builder.setBolt("SplitBolt",new SplitBolt()).shuffleGrouping("DataSourceSpout");
        builder.setBolt("SumBolt",new SumBolt()).shuffleGrouping("SplitBolt");


        //创建一个本地Storm集群，本地模式运行，不需要搭建Storm集群
        LocalCluster cluster = new LocalCluster();
        cluster.submitTopology("LocalWordStormTopology",new Config(),builder.createTopology());


    }

}

package count;

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

import java.util.Map;


public class LocalSumStormTopology {

    /**
     * Spout需要继承BaseRichSpout
     * 数据源需要产生数据并发射
     */
    public static class DataSourceSpout extends BaseRichSpout {

        private SpoutOutputCollector collector;

        int number = 0;

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
         * 会产生数据，在生产上肯定是从消息队列中获取数据
         * 这个方法是一个死循环，会一直不停的执行
         */
        @Override
        public void nextTuple() {
            this.collector.emit(new Values(++number));
            System.out.println("Spout:" + number);
            //防止数据产生太快
            Utils.sleep(1000);
        }

        /**
         * 声明输出字段
         *
         * @param outputFieldsDeclarer
         */
        @Override
        public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {
            outputFieldsDeclarer.declare(new Fields("num"));
        }
    }


    /**
     * Bolt需要继承BaseRichBolt
     * 数据的累积求和Bolt:接收数据并处理
     */
    public static class SumBolt extends BaseRichBolt{

        int sum =0;
        /**
         * 初始化方法，会被执行一次
         * @param map
         * @param topologyContext
         * @param outputCollector
         */
        @Override
        public void prepare(Map map, TopologyContext topologyContext, OutputCollector outputCollector) {

        }

        /**
         * 死循环，一直执行下去：获取Spout发送过来的数据
         * @param tuple
         */
        @Override
        public void execute(Tuple tuple) {
           //Bolt中获取值可以根据index取值，也可以根据一个环节中定义的field的名称获取（建议使用该方式）
           Integer value = tuple.getIntegerByField("num");
           sum+=value;
            System.out.println("Bolt sum:"+value);
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
        builder.setBolt("SumBolt",new SumBolt()).shuffleGrouping("DataSourceSpout");


        //创建一个本地Storm集群，本地模式运行，不需要搭建Storm集群
        LocalCluster cluster = new LocalCluster();
        cluster.submitTopology("LocalSumStormTopology",new Config(),builder.createTopology());


    }
}

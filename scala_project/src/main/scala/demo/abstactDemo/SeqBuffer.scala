package demo.abstactDemo

abstract class SeqBuffer extends Buffer {
type U
type T <: Seq[U]
def length = element.length
}

abstract class IntSeqBuffer extends SeqBuffer{
  type U = Int
}

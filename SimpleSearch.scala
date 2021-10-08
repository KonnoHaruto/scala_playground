object SimpleSearch extends App {
  val text = "カワカドカドカドドワンゴカドカドンゴドワドワンゴドワカワカドンゴドワ".toSeq
  val pattern = "ドワンゴ".toSeq
  val matchIndexes = search(text, pattern)

// 戻り値には出現箇所の添字を取得するためにSeq[Int]型にする
  def search(text: Seq[Char], pattern: Seq[Char]): Seq[Int] = {
    var matchIndexes = Seq[Int]()
    // for式のuntilはuntilにする事によって最後の自身の数は含まないように範囲を制限している
    for (i <- 0 until text.length -1) {
      // text.sliceのsliceはSeqの関数。第一引数から第二引数までの添字の部分のシーケンスを切り出すことができる。
      val partText = text.slice(i, i + pattern.length)
      println(partText)
    }
    matchIndexes
  }
  println(s"出現箇所: ${matchIndexes}")
}
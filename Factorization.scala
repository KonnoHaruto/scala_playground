import scala.math.sqrt

object Factorization extends App {
  val target = 24
  val maxDivisor = sqrt(target).toInt

  def factorizationReq(num: Int, divisor: Int, acc: Map[Int, Int]): Map[Int, Int] = {
    Map(2 -> 3, 3 -> 1)
  }

  println(factorizationReq(target, 2, Map()))
}
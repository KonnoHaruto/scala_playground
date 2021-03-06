import scala.math.sqrt

object Factorization extends App {
  val target = 510510
  val maxDivisor = sqrt(target).toInt

  def factorizationReq( num: Int, divisor: Int, acc: Map[Int, Int] ): Map[ Int, Int ] = {
    if ( divisor > maxDivisor ) {
      if (num == 1) acc else acc + (num -> 1)
    } else if ( num % divisor == 0) {
      val nextAcc = acc + (divisor -> (acc.getOrElse(divisor, 0) + 1))
      factorizationReq(num / divisor, divisor, nextAcc)
    } else {
      factorizationReq(num, divisor + 1, acc)
    }
  }

  println(factorizationReq(target, 2, Map()))
}
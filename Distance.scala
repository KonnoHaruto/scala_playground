object Distance extends App {
  val kilometersPerHours = 11.0 
  val minutes = 100 
  val distance = kilometersPerHours * minutes / 60.0
  println(s"走った距離は${distance}メートルです。")
}
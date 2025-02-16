package demo

object While_Loop {
  def main(args: Array[String]): Unit = {
    var x = 0
    while (x < 10) {
      println(s"x = $x")
      x += 1
    }

    var y = 0;
    do {
      println(s"y = $y")
      y += 1
    } while (y < 0)
  }
}

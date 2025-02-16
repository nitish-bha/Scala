package demo

object WhileLoop {
  def main(args: Array[String]): Unit = {
    var x = 0
    while (x < 10) {
      println(s"x = $x")
      x += 1
    }

    var y = 0
    while (y < 1) {
      println(s"y = $y")
      y += 1
    }
  }
}

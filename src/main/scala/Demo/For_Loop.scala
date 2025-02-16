package Demo

object For_Loop {
  def main(args: Array[String]): Unit = {
    for(i<- 1 to 5){
      println("i is using to " + i)
    }
    for (i<- 1.until(6)){
      println("i is using until " + i);
    }
  }
}

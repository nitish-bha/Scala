package Demo

object Match_Expressions {
  def main (args: Array[String]): Unit = {
    val age = "30";

    age match{
      case "20" => println(age);
      case "23" => println(age);
      case "30" => println(age);
      case "2" => println(age);
      case "21" => println(age);
      case "18" => println(age);
      case "50" => println(age);
    }

  }
}

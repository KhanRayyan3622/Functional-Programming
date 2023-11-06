import scala.collection.mutable

object Rayyan {
  def main(args: Array[String]): Unit = {
    def getDirections(dir: Option[String]): String = dir match {
      case Some(dir) => s"$dir!"
      // if incase nothing is entered
      case None => "I don't know"
    }

    val input1: Option[String] = Some("Go to right")
    val input2: Option[String] = Some("Go to left")
    val input3: Option[String] = None

    println(getDirections(input1))
    println(getDirections(input2))
    println(getDirections(input3))

  }
}

import scala.collection.mutable
import scala.collection.mutable.Set
import scala.collection.mutable.Map

  object Rayyan {
    def main(args: Array[String]): Unit = {

      val mutableSet = Set(1, 7, 2, 3, 4, 6)

      mutableSet += 5
      mutableSet -= 7
      print("The mutable set is: ")
      mutableSet.foreach(println)

      val mutableMap = Map("a" -> 1, "b" -> 2)

      mutableMap("c") = 3
      mutableMap.remove("b")
      print("The mutable map is: ")
      mutableSet.foreach(println)

    }
  }

import scala.util.Random
import scala.collection.mutable

object Rayyan {
  def main(args: Array[String]): Unit = {
    val ran_num = new Random()
    val n = ran_num.nextInt(500)
    println(n)

    val mylist = scala.collection.mutable.ListBuffer[Int]()
    mylist.append(ran_num.nextInt(500))
    mylist.append(ran_num.nextInt(500))
    mylist.append(ran_num.nextInt(500))
    mylist.append(ran_num.nextInt(500))
    mylist.append(ran_num.nextInt(500))
    mylist.append(ran_num.nextInt(500))
    mylist.append(ran_num.nextInt(500))
    mylist.append(ran_num.nextInt(500))
    mylist.append(ran_num.nextInt(500))
    mylist.append(ran_num.nextInt(500))
    mylist.append(ran_num.nextInt(500))
    mylist.append(ran_num.nextInt(500))
    mylist.append(ran_num.nextInt(500))
    mylist.append(ran_num.nextInt(500))

    println(mylist)
    val sortedList = mylist.sorted
    println(sortedList)

    val mapName = sortedList.zip(mylist).toMap
    println(mapName)
  }
}

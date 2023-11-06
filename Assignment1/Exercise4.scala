object Rayyan {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    // head is used to get the first element
    val first = numbers.head
    println(s"The First element is: $first")
    // tail is used to get the remaining elements
    val remain= numbers.tail
    println(s"The Remaining elements are: $remain")
    // map is used to double each number
    val doubled = numbers.map(x => x * 2)
    println(s"The Doubled numbers are: $doubled")
    // filter to used to get even numbers
    val even = numbers.filter(x => x % 2 == 0)
    println(s"Even numbers are: $even")
  }
}

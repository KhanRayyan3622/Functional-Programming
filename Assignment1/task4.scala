object Rayyan {
  def main(args: Array[String]): Unit = {
    def even1(n: Array[Int]): Int = {
      n.count(_ % 2 == 0)
    }

    def even2(n: Array[Int]): Int = {
      n.filter(_ % 2 == 0).length
    }

    val array: Array[Int] = Array.fill(100)(util.Random.nextInt(100))

    println(even1(array))
    println(even2(array))
  }
}

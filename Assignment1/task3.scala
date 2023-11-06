object Rayyan {
    def main(args: Array[String]): Unit = {
      def sum(x: Array[Double], y: Array[Double]): Array[Double] = {
        x.zipWithIndex.map { case (num, index) => num + y(index) }
      }

      val a = Array[Double](1, 2, 3)
      val b = Array[Double](4, 5, 6)

      val sumResult = sum(a, b)
      sumResult.foreach(println)
    }
  }



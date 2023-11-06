object Rayyan {
  def main(args: Array[String]): Unit = {
    val startAscii = 97 // ASCII value for 'a'
    val endAscii = 122 // ASCII value for 'z'

    def charArray(startNum: Int): List[Char] = {
      (startNum to endAscii).map(_.toChar).toList
    }

    val charList = charArray(startAscii)

    println("Character List: " + charList.mkString(", "))
  }
}

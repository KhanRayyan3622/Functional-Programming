def buildMap [ A , B ]( data : Seq [ A ] , f : A = > B ) : Map [ B , A ]{
  // code here
  }
  where ‘f’ is an user defined function which is passed as parameter. Below is an example of how we
  can use buildMap method to make a Map collection.
  // Example
  val lst = Array (1 ,2 ,3 ,4 ,5)
  def func ( x : Int ) : Boolean = x %2 == 0 // entry is even or not
  val result = buildMap ( lst , func )
  // Output
  // result : Map [ Int , Boolean ] = Map (1 -> false , 2 -> true , 3 -> false, 4 ->True)

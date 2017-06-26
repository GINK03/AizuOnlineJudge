
fun main( args : Array<String> ) {
  (1..9).map { x -> 
    (1..9).map { y ->
      println("${x}x${y}=${x*y}")
    }
  }
}

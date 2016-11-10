package puzzler6

fun main(args: Array<String>) {
  val x = listOf(1, 2, 3)
  println(x is kotlin.collections.List)
  println(x is kotlin.collections.List<Int>)
  println(x is java.util.List<*>)
}

// What will it print?
// a) true; true; true
// b) true; true; false
// c) false; true; false
// d) false; true; true

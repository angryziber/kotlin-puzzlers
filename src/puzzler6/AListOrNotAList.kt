package puzzler6

fun main(args: Array<String>) {
  val x = listOf(1, 2, 3)
  println(x is kotlin.collections.List<Int>)
  println(x is kotlin.collections.MutableList)
  println(x is java.util.List<*>)
}

// What will it print?
// a) true; true; true
// b) true; true; false
// c) true; false; false
// d) true; false; true

package puzzler4

fun main(args: Array<String>) {
  val x: String? = null
  print(x.isNullOrEmpty())
}

// What will it print?
// a) true
// b) false
// c) NullPointerException
// d) Will not compile
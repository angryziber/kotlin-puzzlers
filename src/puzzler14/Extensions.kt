package puzzler14

fun String.hello() = "x"
fun String.toString() = "$this!"

fun main(args: Array<String>) {
  print("y".hello())
}

// What will it print?
// a) x
// b) y
// c) x!
// d) y!

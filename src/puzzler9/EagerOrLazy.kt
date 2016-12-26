package puzzler9

fun main(args: Array<String>) {
  val x = listOf(1, 2, 3).filter { print("$it "); it >= 2 }
  print("before sum ")
  println(x.sum())
}

// What will it print?
// a) 1 2 3 before sum 5
// b) 2 3 before sum 5
// c) before sum 1 2 3 5
// d) order is not deterministic

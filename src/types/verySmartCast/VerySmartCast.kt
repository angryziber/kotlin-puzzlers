package types.verySmartCast
// inspired by Dmitry Kandalov @dkandalov

fun main(args: Array<String>) {
  val x: Any = "123"
  val z = if (x is String && x is Int) x.inc() + x.length else 123
  println(z)
}

// What will it print?
// a) 123
// b) 127
// c) ClassCastException
// d) will not compile
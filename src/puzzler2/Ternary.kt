package puzzler2

fun main(args: Array<String>) {
  val x: String? = "foo"
  // print(x == "foo" ? "is foo" : "not a foo") - not Java
  print(if (x == "foo") "is foo" else "not a foo")
}

// What will it print?
// a) is foo
// b) not a foo
// c) Code does not compile
// d) TypeCastException

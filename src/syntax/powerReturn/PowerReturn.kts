package syntax.powerReturn

fun hello(): String {
  val result = return throw return "Hello"
  println(result.toString())
}

println(hello())

// What will it print?
// a) Hello
// b) Hello Hello
// c) will not compile
// d) none of the above

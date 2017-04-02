package syntax.powerReturn

fun hello(): String {
  return return return "Hello"
}

println(hello())

// What will it print?
// a) Hello
// b) Hello Hello Hello
// c) nothing
// d) will not compile

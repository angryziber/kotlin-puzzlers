package functions.overextension

fun String.hello() = "!$this"
fun String.toString() = "$this!"

println("x".hello())

// What will it print?
// a) x
// b) !x
// c) !x!
// d) Will not compile

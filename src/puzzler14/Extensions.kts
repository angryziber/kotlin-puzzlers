package puzzler14

fun String.hello() = "!$this"
fun String.toString() = "$this!"

print("x".hello())

// What will it print?
// a) x
// b) !x
// c) !x!
// d) Will not compile

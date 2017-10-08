package functions.overextension

operator fun String.invoke(x: () -> String) = this + x()
fun String.z() = "!$this"
fun String.toString() = "$this!"

println("x"{"y"}.z())

// What will it print?
// a) !x
// b) !xy
// c) !xy!
// d) Will not compile

package nullability.nullean

val s: String? = null
if (s?.isEmpty()) println("true")

// What will it print?
// a) Nothing
// b) true
// c) NullPointerException
// d) Will not compile

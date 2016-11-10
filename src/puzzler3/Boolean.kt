package puzzler3

fun main(args: Array<String>) {
  val s: String? = null
  // if (s?.isEmpty()) println("true") - not Groovy
  if (s != null && s.isEmpty()) println("true")
}

// What will it print?
// a) Nothing
// b) true
// c) NullPointerException
// d) Code does not compile

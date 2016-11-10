package puzzler4

class Large(val medium: Medium? = null)
class Medium(val small: Small? = null)
class Small(val hello: String = "Hello")

fun main(args: Array<String>) {
  val large = Large()
  println(large?.medium?.small?.hello)
}

// What will it print?
// a) Hello
// b) null
// c) NullPointerException
// d) Code does not compile

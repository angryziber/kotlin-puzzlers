// by Grigorii Yurkov @rpuxa

class Error(val code: Int) {
  override fun toString(): String = "Error $code"
}

enum class Errors(code: Int, val error: Error = error(code)) {
  E1(1), E2(2), E3(3);
  fun error(code: Int) = Error(code)
}

Errors.values().forEach { println(it.error) }

// What will it print?
// a) Error 1; Error 2; Error 3
// b) An exception
// c) Will not compile
// d) None of the above

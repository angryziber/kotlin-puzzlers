// by Grigorii Yurkov @rpuxa

import kotlin.contracts.*

inline fun runLambda(block: () -> Unit) {
  contract {
    callsInPlace(block, InvocationKind.EXACTLY_ONCE)
  }
}

fun hello(): String {
  var hello: String
  runLambda { hello = "Kotlin" }
  return hello
}

fun main() {
  println(hello().plus(hello()))
}

// What will it print?
// a) KotlinKotlin
// b) NullPointerException
// c) nullnull
// d) Will not compile

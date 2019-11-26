// by Grigorii Yurkov @rpuxa
import kotlin.contracts.*
import kotlin.contracts.InvocationKind.*

inline fun runExactlyOnce(block: () -> Unit) {
  contract {
    callsInPlace(block, EXACTLY_ONCE)
  }
}

fun hello(): String {
  var hello: String
  runExactlyOnce { hello = "Kotlin" }
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

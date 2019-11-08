package contracts.readTheFineprint
// by Grigorii Yurkov @rpuxa

import kotlin.contracts.*

inline fun runLambda(block: () -> Unit) {
  contract {
    callsInPlace(block, InvocationKind.AT_LEAST_ONCE)
  }
}

fun getNothing(): Nothing {
  runLambda { throw UnsupportedOperationException("Can't return Nothing!") }
}

fun main() {
  val nothing: Nothing = getNothing()
  print("Hello ")
  print(nothing as String)
}

// What will it print?
// a) UnsupportedOperationException
// b) NullPointerException
// c) Hello TypeCastException
// d) Will not compile
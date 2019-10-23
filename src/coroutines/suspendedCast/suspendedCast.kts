// by Grigorii Yurkov @rpuxa

import kotlinx.coroutines.*
import kotlin.coroutines.intrinsics.*

fun printAndReturnInt(string: String): Int {
  print(string)
  return 43
}

suspend fun returnString(): String =
  suspendCoroutineUninterceptedOrReturn {
    printAndReturnInt("42 ")
  }

runBlocking { // TODO: GlobalScope.run()
  print(returnString())
}

// What will it print?
// a) 42 43
// b) 42 ClassCastException
// c) Will not compile
// d) None of the above

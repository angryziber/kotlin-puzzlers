// after Grigorii Yurkov @rpuxa
import kotlinx.coroutines.*
import kotlin.coroutines.intrinsics.*

suspend fun returnString(): String =
  suspendCoroutineUninterceptedOrReturn { 42 }

runBlocking {
  print(returnString())
}

// What will it print?
// a) 42
// b) ClassCastException
// c) Will not compile
// d) None of the above

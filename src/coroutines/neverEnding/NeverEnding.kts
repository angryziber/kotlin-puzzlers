// by Grigorii Yurkov @rpuxa

import kotlinx.coroutines.*
import kotlin.coroutines.intrinsics.*

suspend fun getAny(): Any = COROUTINE_SUSPENDED

runBlocking {
  val result = withTimeoutOrNull(100) { getAny() == getAny() }
  println(result)
}

// What will it print?
// a) true
// b) false
// c) null
// d) None of the above

// after Grigorii Yurkov @rpuxa
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.intrinsics.*

suspend fun absolute(): Nothing =
  suspendCoroutineUninterceptedOrReturn {}

fun printNothing(nothing: Nothing) =
  print(nothing.toString())

runBlocking {
  printNothing(absolute())
}

// What will it print?
// a) kotlin.Nothing
// b) java.lang.Void
// c) An exception
// d) Will not compile

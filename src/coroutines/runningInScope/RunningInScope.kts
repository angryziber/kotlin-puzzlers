import kotlinx.coroutines.*

suspend fun printx() {
  delay(100)
  print("x")
}

GlobalScope.run {
  printx()
}

// What will it print?
// a) x
// b) kotlin.Unit
// c) Nothing
// d) Will not compile

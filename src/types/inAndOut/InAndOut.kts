class Hipster<in T> {
  val stomach = mutableSetOf<T>()
  fun eat(what: Collection<out T>) { stomach += what }
  fun eat(what: Comparable<T>) { stomach += what as T }
}

Hipster<CharSequence>().apply {
  eat(setOf("burger", "fries"))
  print(stomach)
}

// What will it print?
// a) [burger, fries]
// b) []
// b) an Exception
// c) will not compile

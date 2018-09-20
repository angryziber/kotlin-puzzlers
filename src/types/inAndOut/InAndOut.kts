class Hipster<in T> {
  fun eat(t: Set<out T>) = print(t)
}

Hipster().eat(setOf("burger", "fries"))

// What will it print?
// a) [burger, fries]
// b) ClassCastException
// c) will not compile due to conflicting variance
// d) will not compile due to failed type inference

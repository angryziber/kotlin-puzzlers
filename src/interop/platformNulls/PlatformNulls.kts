package interop.platformNulls

class Kotlin {
  fun hello(name: String) = print("Hello $name")
}

val prop = System.getProperty("key")
Kotlin().hello(prop)

// What will it print?
// a) Hello
// b) Hello null
// c) will not compile
// d) none of the above

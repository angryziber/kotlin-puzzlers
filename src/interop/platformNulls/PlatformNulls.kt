package p3_platformNulls

class Kotlin {
  fun hello(name: String) = print("Hello $name")
}

fun main(args: Array<String>) {
  val prop = System.getProperty("key")
  Kotlin().hello(prop)
}

// What will it print?
// a) Hello
// b) Hello null
// c) NullPointerException
// d) IllegalStateException

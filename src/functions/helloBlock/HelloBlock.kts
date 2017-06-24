package functions.helloBlock

fun hello(block: String.() -> Unit) {
  "Hello1".block()
  block("Hello2")
}

hello { print(this) }

// What will it print?
// a) Hello1
// b) Hello2
// c) Hello1Hello2
// d) will not compile

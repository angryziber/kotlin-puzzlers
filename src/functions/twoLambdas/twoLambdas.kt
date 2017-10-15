package functions.twoLambdas
// by @a-dminator

typealias L = (String) -> Unit

private fun foo(one: L = {}, two: L = {}) {
  one("one")
  two("two")
}

fun main(args: Array<String>) {
  foo({ print(it) })
  foo { print(it) }
}

// What will it print?
// a) oneone
// b) twotwo
// c) onetwo
// d) Will not compile
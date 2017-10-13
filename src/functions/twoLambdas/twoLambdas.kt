package functions.twoLambdas
// by @a-dminator

private fun foo(one: (String) -> Unit = {}, two: (String) -> Unit = {}) {
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
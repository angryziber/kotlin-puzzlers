package functions.twoLambdas
// by @a-dminator

typealias L = (String) -> Unit

fun foo(one: L = {}, two: L = {}) {
  one("one")
  two("two")
}

foo { print(it) }
foo({ print(it) })

// What will it print?
// a) oneone
// b) twotwo
// c) onetwo
// d) none of the above
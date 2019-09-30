package functions.overloadedOoops
// by @ConstOrVar

fun test(block: () -> Int = { 0 }): String {
  return "${block()}"
}

fun test2(block: () -> Int = { 0 }): () -> String {
  return { test(block) }
}

{ println("Start") }()

val a = test { 2 } == test2 { 2 }()
val b = test() == test2()()

{ println("Finish $a $b") }()

// What will it print?
// a) true true
// b) true false
// c) true Unit
// d) Will not compile

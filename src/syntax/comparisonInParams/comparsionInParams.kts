package syntax.comparisonInParams
// by Roman Donchenko @drstranges

fun foo(a: Boolean, b: Boolean) = print("$a, $b")

val a = 1
val b = 2
val c = 3
val d = 4

foo(c < a, b > d)

// What will it prints?
// a) true, true
// b) false, false
// c) null, null
// d) Will not compile

package functions.overloadedOoops
// by @ConstOrVar

fun test(block: () -> Int = { 0 }) = "${block()}"

val a = test { 2 }
val b = test()

//print("Debug")
//{ 1 }
println("$a $b")

// What will it print?
// a) 2 0
// b) 2 1
// c) 2 Unit
// d) Will not compile

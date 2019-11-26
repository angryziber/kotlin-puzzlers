// by @ConstOrVar

fun test(block: () -> Int = {0}) = "${block()}"

val a = test{2}
val b = test()

//print("Debug")
{1.also{print(it)}};
{println("$a $b")}

// What will it print?
// a) 2 0
// b) 2 1
// c) 1() -> kotlin.Unit
// d) Will not compile

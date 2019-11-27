// by Grigorii Yurkov @rpuxa

fun Any.toConsole() = print("$this  ")

val list = listOf(1, 2, 3)
val array = IntArray(1)

{ 42 }.toConsole()
list.toConsole()
array.toConsole()

// What will it print?
// a) 42  [1, 2, 3]  1
// b) kotlin.Function<Int>  [1, 2, 3]  1
// c) 42  [1, 2, 3]  [I@********
// d) None of the above

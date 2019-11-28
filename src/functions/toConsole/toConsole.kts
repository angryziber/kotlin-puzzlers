// by Grigorii Yurkov @rpuxa

fun Any.toConsole() = print("$this  ")

val list = List(1, {it})
val array = IntArray(1)

{42}.toConsole()
list.toConsole()
array.toConsole()

// What will it print?
// a) 42  [1]  1
// b) kotlin.Function<Int>  [0]  1
// c) 42  [0]  [I@********
// d) None of the above

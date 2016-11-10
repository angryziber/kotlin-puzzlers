package puzzler9

fun filterMe(arg: Int): Boolean {
  val list = listOf(1, 2, 3).filter {
    return it >= arg
  }
  return list.isNotEmpty()
}

fun main(args: Array<String>) {
  print(filterMe(2))
}

// What will it print?
// a) true
// b) false
// c) Will stuck in an infinite loop
// d) Code will not compile

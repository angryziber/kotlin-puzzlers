package functions.sneakyReturn

fun numbers(list: List<Int>) {
  list.forEach {
    if (it > 2) return
    print(it)
  }
  print("ok")
}

numbers(listOf(1, 2, 3))

// What will it print?
// a) 123ok
// b) 12ok
// c) 12
// d) Infinite loop

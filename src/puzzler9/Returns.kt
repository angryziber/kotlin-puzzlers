package puzzler9

fun main(args: Array<String>) {
  listOf(1, 2, 3).forEach {
    if (it > 2) return
    print(it)
  }
  print("done")
}

// What will it print?
// a) 123done
// b) 12done
// c) 12
// d) Will stuck in an infinite loop

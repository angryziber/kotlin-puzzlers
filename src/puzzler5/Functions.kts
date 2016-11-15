package puzzler5

fun main(args: Array<String>) {
  main2()
  main3()
}

fun main2() = print("Hello")

fun main3() = {
  print("Hello")
}

// What will it print?
// a) Hello
// b) HelloHello
// c) Nothing
// d) Will not compile

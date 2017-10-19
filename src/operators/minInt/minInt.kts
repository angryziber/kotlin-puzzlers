package operators.minInt
// inspired by Erik Jõgi

fun printInt(n: Int) {
  println(n)
}

printInt(-2_147_483_648.inc())

// What will it print?
// a) -2147483647
// b) -2147483649
// c)  2147483647
// d) none of the above

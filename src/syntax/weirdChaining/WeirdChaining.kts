package syntax.weirdChaining
// by Kevin Most @kevinmost

fun printNumberSign(num: Int) {
  if (num < 0) {
    "negative"
  } else if (num > 0) {
    "positive"
  } else {
    "zero"
  }.let { println(it) }
}

printNumberSign(-2)
printNumberSign(0)
printNumberSign(2)

// What will it print?
// a) negative; zero; positive
// b) negative; zero
// c) negative; positive
// d) zero; positive

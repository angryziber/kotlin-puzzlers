package syntax.weirdChaining

fun printNumberSign(num: Int) {
  if (num < 0) {
    "negative"
  } else if (num > 0) {
    "positive"
  } else {
    "zero"
  }.let { print(it) }
}

printNumberSign(-2)
print(",")
printNumberSign(0)
print(",")
printNumberSign(2)

// What will it print?
// a) negative,zero,positive
// b) negative,zero,
// c) negative,,positive
// d) ,zero,positive

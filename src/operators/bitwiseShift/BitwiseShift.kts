package operators.bitwiseShift

var result: Int = 0

for (i in 0..32) {
  result += (1 shl i)
}

println(result)

// What will it print?
// a) 2147483647 (Int.MAX_VALUE)
// b) 0
// c) -1
// d) -2147483648 (Int.MIN_VALUE)

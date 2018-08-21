package functions.closeCapture
// Inspired by Konstantin-Khvan

val result = mutableListOf<() -> Unit>()
var i = 0
for (j in 1..3) {
  i++
  result += { print("$i $j; ") }
}

result.forEach { it() }

// What will it print?
// a) 1 1; 2 2; 3 3
// b) 1 3; 2 3; 3 3
// c) 3 1; 3 2; 3 3
// d) none of the above

// by Roman Bielokon @Kvest

fun process(num: Int) = if (num % 2 == 0) {
  print("$num, ")
  true
} else {
  false
}

val arr = arrayOf(0, 1, 2, 3, 4, 5)
val result = arr.fold(true) { acc, num ->
  acc && process(num)
}
println(result)

// What will be printed?
// a) 0, 2, 4, false
// b) 0, 2, 4, true
// c) 0, false
// d) 0, 1, 2, 3, 4, 5, true

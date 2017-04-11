package collections.inclusiveRanges

val range = 0..9 step 3

println(range.joinToString())

// What will it print?
// a) 3, 6
// b) 0, 3, 6
// c) 0, 3, 6, 9
// d) 0..9 step 3

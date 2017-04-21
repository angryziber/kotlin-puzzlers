package collections.reversedRanges

val range = 0..10

val reverseThenStep = range.reversed().step(3).toList()
val stepThenReverse = range.step(3).reversed().toList()

println(reverseThenStep == stepThenReverse)

// What will it print?
// a) true
// b) false
// c) IllegalStateException
// d) AssertionError

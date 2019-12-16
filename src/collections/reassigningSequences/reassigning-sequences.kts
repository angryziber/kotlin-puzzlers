package collections.reassigningSequences
// by marstran

var seq = sequenceOf(1)

seq = seq.map { seq.sum() }

println(seq.toList())

// What will it print?
// a) [1]
// b) NullPointerException
// c) StackOverflowError
// d) Does not compile
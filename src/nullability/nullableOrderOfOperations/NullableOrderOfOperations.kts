package nullability.nullableOrderOfOperations
// by Thomas Nield @thomasnield

val x: Int? = 2
val y: Int = 3

val sum = x?:0 + y

println(sum)

// What will it print?
// a) 3
// b) 5
// c) 2
// d) 0

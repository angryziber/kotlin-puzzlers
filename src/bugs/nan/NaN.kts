// by Grigorii Yurkov @rpuxa

val number: Number = 0.0 / 0.0
println(if (number is Double) number == number else "number !is Double")

// What will it print?
// a) true
// b) false
// c) number !is Double
// d) It depends

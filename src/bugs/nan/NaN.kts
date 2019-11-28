// by Grigorii Yurkov @rpuxa

val number: Number = 0.0 / 0.0
println(if (number is Double) number == number else "not Double")

// What will it print?
// a) true
// b) false
// c) It depends
// d) None of the above

package types.matchingLambdas
// by Róbert Papp (TWiStErRob)

fun <T> pick(first: Boolean, f1: () -> T, f2: () -> T): T =
	if (first) f1() else f2()

println(pick(true, { 1 }, { "2" }))
println(pick(false, { 1 }, { "2" }))

// What will it print?
// a) 1 and 2 on separate lines
// b) ClassCastException: String cannot be cast to Integer
// c) Fails to compile due to Int and String mismatch in T
// d) ClassCastException: Int cannot be cast to String

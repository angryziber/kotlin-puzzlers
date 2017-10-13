// suggested by @guai

operator fun Nothing?.not() = Unit
operator fun Unit.not() = null

val foo = null

println(!!!!!foo!!!!)

// What will it print?
// a) null
// b) kotlin.Unit
// c) KotlinNullPointerException
// d) will not compile

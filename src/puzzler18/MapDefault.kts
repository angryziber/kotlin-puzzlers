package puzzler18

val map = mapOf<Any, Any>().withDefault{ "default" }
println(map["1"])

// What will it print?
// a) default
// b) nothing
// c) null
// d) will not compile
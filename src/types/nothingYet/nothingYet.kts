package types.nothingYet
// by Marat Kh. Akhin

fun <T> Any?.asGeneric() = this as? T

42.asGeneric<Nothing>()!!!!

val a = if (true) 87
println(a)

// What will it print?
// a) 87
// b) kotlin.Unit
// c) ClassCastException
// d) will not compile

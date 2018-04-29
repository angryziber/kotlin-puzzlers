package types.nothingYet

fun <T> Any?.asGeneric() = this as? T

42.asGeneric<Nothing>()!!

val a = if (true) 87

println(a)

// What will it print?
// a) 87
// b) will not compile
// c) ClassCastException
// d) kotlin.Unit

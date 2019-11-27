// by Andrei Solntsev

fun findUser() = null

val user = findUser()
val found = user != null ?: false
println(found)

// What will it print?
// a) true
// b) false
// c) kotlin.Unit
// d) None of the above

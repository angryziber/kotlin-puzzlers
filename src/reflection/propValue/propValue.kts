package reflection.propValue

import kotlin.reflect.full.memberProperties

data class User(val name: String)

val user = User("Hello")
println(user::class.memberProperties.first().get(user))

// What will it print?
// a) Hello
// b) name
// c) An exception
// d) Will not compile?

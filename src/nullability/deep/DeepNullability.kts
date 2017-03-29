package nullability.deep

class Large(val medium: Medium? = null)
class Medium(val small: Small? = null)
class Small(val hello: String = "Hello")

val large = Large()
println(large?.medium?.small?.hello)

// What will it print?
// a) Hello
// b) null
// c) NullPointerException
// d) Will not compile

package types.cyclicObjectConstructions

open class A(val x: Any?)

object B : A(C)
object C : A(B)

println(B.x)
println(C.x)

// What will it print?
// a) null; null
// b) C@2f92e0f4; null
// c) NullPointerException
// d) will not compile

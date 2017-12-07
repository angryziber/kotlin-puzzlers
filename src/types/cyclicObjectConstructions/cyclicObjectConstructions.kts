// by Hiroshi Kurokawa @hkurokawa

open class A(val x: Any?)

object B : A(C)
object C : A(B)

println(B.x)
println(C.x)

// What will it print?
// a) null; null
// b) C@1544bf85; null
// c) ExceptionInInitializerError
// d) will not compile

// by Hiroshi Kurokawa @hkurokawa

open class A(val x: Any?) {
  override fun toString() = javaClass.simpleName
}

object B : A(C)
object C : A(B)

println(B.x)
println(C.x)

// What will it print?
// a) null; null
// b) C; null
// c) ExceptionInInitializerError
// d) will not compile

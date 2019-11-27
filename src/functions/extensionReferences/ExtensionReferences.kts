abstract class A
class B : A()

fun A.foo() = println("foo(A)")
fun B.foo() = println("foo(B)")

val b = B()
val a: A = b
a.foo()

// What will it print?
// a) foo(A)
// b) foo(B)
// c) IllegalStateException
// d) will not compile

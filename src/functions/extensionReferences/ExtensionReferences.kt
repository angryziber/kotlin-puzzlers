package functions.extensionReferences

abstract class A
class B : A()

fun A.foo() {
    println("foo(A)")
}

fun B.foo() {
    println("foo(B)")
}

fun main(args: Array<String>) {
    val b = B()
    val a: A = b
    a.foo()
}

// What will it print?
// a) foo(A)
// b) foo(B)
// c) IllegalStateException
// d) will not compile

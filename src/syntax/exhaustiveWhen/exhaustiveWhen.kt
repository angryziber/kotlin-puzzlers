package syntax.exhaustiveWhen

sealed class X
class A : X()
class B : X()
class C : X()

fun printClassOf(x: X) {
  when (x) {
    is A -> println("is A")
    is B -> println("is B")
  }
}

fun main(args: Array<String>) {
  printClassOf(A())
  printClassOf(B())
  printClassOf(C())
}

// What will it print?
// a) is A; is B
// b) IllegalStateException
// c) will not compile
// d) none of the above

package types.cyclicStaticInitialization
// by David Sommerich @sommd

open class A {
  companion object {
    val a = B.b
  }
}

object B : A() {
  val b = "hello"
}

// Part 1

println(B.b)

// What will it print?
// a) hello
// b) null
// c) ExceptionInInitializerError
// d) will not compile

// Part 2 (comment out part 1 before running)

//println(A.a)
//println(B.b)

// What will it print?
// a) hello hello
// b) null hello
// c) hello null
// c) ExceptionInInitializerError

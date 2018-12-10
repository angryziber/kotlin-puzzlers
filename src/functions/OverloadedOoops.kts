package functions.overloadedOoops

class Test {

    fun test(block: () -> Int = { 0 }): String {
        return "${block()}"
    }

    fun test2(block: () -> Int = { 0 }): () -> String {
        return { test(block) }
    }
}


{ println("Start") }()


val t = Test()
val a = t.test { 2 } == t.test2 { 2 }()
val b = t.test() == t.test2()()


{ println("Finish $a $b") }()

// What will it print?
// a) true true
// b) true false
// c) true Unit
// d) Will not compile

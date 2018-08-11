private fun call(toCall: (String) -> Unit) {
	fun toCall(arg: String) = println("fun: $arg")
	val toCall = fun(arg: String) = println("val: $arg")
	toCall("called")
}

fun main(vararg args: String) {
	call { println("lambda: $it") }
}

// What will it print?
// a) "fun: called"
// b) "val: called"
// b) "lambda: called"
// c) will not compile

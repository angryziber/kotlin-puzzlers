package syntax.functionParameterConfusion

val items = listOf("a", "b", "c")

println(items.joinToString { " + " })

// What will the output be?
// a) "a + b + c"
// b) "a b c"
// c) "a, b, c"
// d) None of the above

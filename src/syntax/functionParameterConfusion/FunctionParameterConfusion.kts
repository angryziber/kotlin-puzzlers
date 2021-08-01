package syntax.functionParameterConfusion

val items = listOf("a", null, "b")

println(items.joinToString { " + " })

// What will the output be?
// a) null
// b) " + , + , + "
// c) "a, null, b"
// d) "a + null + b"

package data.delegate
// by Nikolas Havrikov

data class Container(val name: String, private val items: List<Int>) : List<Int> by items

val (name, items) = Container("Kotlin", listOf(1, 2, 3))
println("Hello $name, $items")

// What will it print?
// a) Hello Kotlin, [1, 2, 3]
// b) Hello Kotlin, 1
// c) Hello 1, 2
// d) Hello Kotlin, 2

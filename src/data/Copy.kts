// inspired by Adam Arold @addamsson

data class Container(val list: MutableList<String>)

val list = mutableListOf("one", "two")
val c1 = Container(list)
val c2 = c1.copy()
list += "oops"
println(c2.list.joinToString())

// What will it print?
// a) one, two
// b) one, two, oops
// c) UnsupportedOperationException
// c) will not compile

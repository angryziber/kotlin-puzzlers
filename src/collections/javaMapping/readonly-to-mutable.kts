package collections.javaMapping

val list = listOf(1, 2, 3)

if(list is MutableList)
    list.add(4)

println(list)

// What will it print?
// a) [1, 2, 3]
// b) [1, 2, 3, 4]
// c) UnsupportedOperationException
// d) Will not compile

package collections.sorting

fun <T> L(vararg i: T) = arrayListOf(*i)

val list = L(1, 5, 3, 2, 4)
val sortedList = list.sort()
print(sortedList)

// What will it print?
// a) [1, 2, 3, 4, 5]
// b) [1, 5, 3, 2, 4]
// c) will not compile
// d) none of the above

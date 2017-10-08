package collections.everythingIsMutable

val readonly = listOf(1, 2, 3)

if (readonly is MutableList)
  readonly.add(4)

println(readonly)

// What will it print?
// a) [1, 2, 3]
// b) [1, 2, 3, 4]
// c) UnsupportedOperationException
// d) Will not compile

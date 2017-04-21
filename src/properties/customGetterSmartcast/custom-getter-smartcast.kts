package properties.customGetterSmartcast

class SmartCastable {
    val list: List<Int> = mutableListOf(1, 2, 3)

    val set: Set<Int> = mutableSetOf(1, 2, 3)
         get() = field
}

val sc = SmartCastable()

if(sc.list is MutableList)
    sc.list.add(4)

if(sc.set is MutableSet)
    sc.set.add(4)

println("${sc.list}, ${sc.set}")

// What will it print?
// a) [1, 2, 3], [1, 2, 3]
// b) [1, 2, 3, 4], [1, 2, 3, 4]
// c) UnsupportedOperationException
// d) Will not compile

val Unit2 = Unit.javaClass.constructors[0].newInstance()
println(Unit == Unit2)

// What will it print?
// a) true
// b) false
// c) IllegalAccessException
// d) none of the above
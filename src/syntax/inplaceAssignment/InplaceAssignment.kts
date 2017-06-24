package syntax.inplaceAssignment

fun myPrint(foo: String) = print(foo)

var foo = "Foo"
myPrint(foo = "Bar")
myPrint(foo)

// What will it print?
// a) FooBar
// b) BarFoo
// c) BarBar
// d) will not compile

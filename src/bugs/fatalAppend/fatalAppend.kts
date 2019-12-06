// by Anton Spaans @streetsofboston
//  & Mikołaj Fornal @florian3k

class Foo(var bar: String)

var baz: Foo? = Foo("test")
baz?.bar += "test"
println(baz)

// What will it print?
// a) Foo(bar=test)
// b) Foo(bar=testtest)
// c) Will not compile
// d) None of the above

package syntax.ternary

val x: String? = "foo"
print(x == "foo" ? "is foo" : "not a foo")

// What will it print?
// a) is foo
// b) not a foo
// c) will not compile
// d) TypeCastException

package p0_ternary

val x: String? = "foo"
print(x == "foo" ? "is foo" : "not a foo")

// What will it print?
// a) is foo
// b) not a foo
// c) Will not compile
// d) TypeCastException

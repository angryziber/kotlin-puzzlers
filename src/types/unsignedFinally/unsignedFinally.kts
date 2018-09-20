package types.unsignedFinally

var x: UInt = 0u
println(x--)
println(--x)

// What will it print?
// a) 4294967295 4294967294
// b) 0 4294967295
// c) 0 -2
// d) will not compile

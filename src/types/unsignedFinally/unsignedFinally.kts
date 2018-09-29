package types.unsignedFinally

var x: UInt = 0u
println(x--.toInt())
println(--x)

// What will it print?
// a) -1 4294967294
// b)  0 4294967294
// c)  0 -2
// d) will not compile

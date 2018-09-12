package types.unsignedFinally

var x: UInt = 0u
println(x--)
println(--x)

// What will it print?
// 1) 4294967295 4294967294
// 2) 0 4294967295
// 3) will not compile
// 4) none of the above

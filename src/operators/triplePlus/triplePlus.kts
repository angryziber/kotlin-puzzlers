// inspired by zhangdatou

infix operator fun Int.plus(i: Int) = this + i + 1

println(-1 + 2)
println(-1 plus 2)
println(-1.plus(2))

// What will it print?
// a) 1  1  1
// b) 2  2  2
// c) 1  2 -3
// d) 2 -4 -4

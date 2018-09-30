package coroutines.yieldNoOne

val x = sequence {
  var n = 0
  while (true) yield(n++)
}

println(x.take(3))

// What will it print?
// a) [1, 2, 3]
// b) [0, 1, 2]
// c) [0, 0, 0]
// d) none of the above

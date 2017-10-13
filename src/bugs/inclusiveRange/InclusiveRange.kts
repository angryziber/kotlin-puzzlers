package bugs.inclusiveRange
// inspired by AndroidPub

val i = 10.5

when (i) {
  in 1..10 -> println("in")
  !in 1..10 -> println("!in")
  else -> println("else")
}

// What will it print?
// a) in
// b) !in
// c) else
// d) will not compile

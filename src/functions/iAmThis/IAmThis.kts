package p8_iAmThis

data class IAm(var foo: String) {
  fun hello() = foo.apply {
    return this
  }
}

println(IAm("bar").hello())

// What will it print?
// a) IAm
// b) IAm(foo=bar)
// c) bar
// d) Will not compile

package puzzler10

data class ApplyThis(var foo: String) {
  fun hello() = foo.apply {
    return this
  }
}

println(ApplyThis("bar").hello())

// What will it print?
// a) ApplyThis
// b) ApplyThis(foo=bar)
// c) bar
// d) Will not compile

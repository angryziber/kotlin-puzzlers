package puzzler10

data class ApplyThis(var blah: String) {
  fun hello() = blah.apply {
    return this
  }
}

fun main(args: Array<String>) {
  println(ApplyThis("blah").hello())
}

// What will it print?
// a) ApplyThis
// b) ApplyThis[blah=blah]
// c) blah
// d) None of the above

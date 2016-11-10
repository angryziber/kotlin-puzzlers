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
// a) puzzler10.ApplyThis
// b) blah
// c) Nothing
// d) None of the above

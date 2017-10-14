package nullability.theOrder
// inspired by Adam Arold @addamsson

class Order {
  private val c: String
  init {
    the()
    c = ""
  }
  private fun the() {
    println(c.length)
  }
}

Order()

// What will it print?
// a) 0
// b) null
// c) will not compile
// d) none of the above

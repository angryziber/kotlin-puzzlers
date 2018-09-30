package types.ghostCity

inline class City(val name: String) {
  public override fun toString() = "'$name'"
}

fun main() {
  val my = City("Tallinn")
  println(my)
}

// What will it print?
// a) Tallinn
// b) 'Tallinn'
// c) City(name=Tallinn)
// d) none of the above

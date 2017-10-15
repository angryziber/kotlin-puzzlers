package nullability.oneChildPolicy
// inspired by Roman Dawydkin @beholder

open class Node(val name: String) {
  fun lookup() = println(name)
}

class Parent : Node("parent") {
  fun child(name: String): Node? = Node(name)

  val child1 = child("child1")?.apply { lookup() }
  val child2 = child("child2").apply { lookup() }
}

Parent()

// What will it print?
// a) child1; child2
// b) child1; parent
// c) parent; child2
// d) none of the above

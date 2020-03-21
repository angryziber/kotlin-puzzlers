package collections.treeTraversal

class Node(val data: String, vararg val children: Node) {
  fun toData(): List<String> = listOf(data) + children.flatMap { toData() }
}

val tree = Node("A", Node("B", Node("C")), Node("D", Node("E")))

println(tree.toData())

// What will it print?
// a) [A, B, C, D, E]
// b) [A, B, D, C, E]
// c) An exception
// d) Will not compile

package collections.sequenceToList
//by Mikhail Naftal

fun generateSeq() = sequence {
  val result = ArrayList<Int>()
  for (i in 1..3) {
    result += i
    yield(result)
  }
}

generateSeq().forEach { print(it.size) }
generateSeq().toList().forEach { print(it.size) }

// What will it print?
// a) 123123
// b) 123333
// c) 123456
// d) IllegalStateException
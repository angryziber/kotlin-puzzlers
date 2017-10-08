package nullability.abstractNull

abstract class NullSafeLang {
  abstract val name: String
  val logo = name[0].toUpperCase()
}

class Kotlin : NullSafeLang() {
  override val name = "kotlin"
}

print(Kotlin().logo)

// What will it print?
// a) K
// b) NullPointerException
// c) IllegalStateException
// d) Will not compile

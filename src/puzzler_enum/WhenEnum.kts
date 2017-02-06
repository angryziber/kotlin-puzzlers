package puzzler_enum

enum class E { e }

val e = E.e
val a = when (E.e) {
  e -> "1"
}

print(a)

// What will it print?
// a) 1
// b) Will not compile
// c) null
// d) NullPointerException

// Puzzler by @a-dminator

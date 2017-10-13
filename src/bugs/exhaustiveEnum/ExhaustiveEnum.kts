package bugs.exhaustiveEnum
// by @a-dminator

enum class E { e }

val e = E.e
val a = when (E.e) {
  e -> "1"
}

print(a)

// What will it print?
// a) 1
// b) null
// c) NullPointerException
// d) will not compile

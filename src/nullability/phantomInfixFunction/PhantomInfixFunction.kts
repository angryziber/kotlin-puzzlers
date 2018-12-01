package nullability.phantomInfixFunction
// by Alexey Hanin @ahanin

class PersonBuilder {
  infix fun String.to(value: Any) {
    print(value)
  }
}

fun person(block: PersonBuilder.() -> Unit) {
  PersonBuilder().block()
}

class John

person {
  "firstname" to John::class.simpleName
  "lastname" to "Doe"
}

// What will it print?
// a) JohnDoe
// b) John
// c) Doe
// d) will not compile
// e) none of the above
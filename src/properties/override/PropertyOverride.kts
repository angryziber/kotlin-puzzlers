package properties.override

open class Named {
  open var name: String? = null
    get() = field ?: "<unnamed>"
}

class Person: Named() {
  override var name: String? = null
    get() = super.name
    set(value) { field = "Mr $value" }
}

val person = Person()
person.name = "Anton"
println(person.name)

// What will it print?
// a) Anton
// b) Mr Anton
// c) <unnamed>
// d) null
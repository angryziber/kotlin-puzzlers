// by Tobias Berger @tobiberger
package delegates.extension.thisRef

import kotlin.reflect.KProperty

class CustomLazy<R: Any, T: Any>(private val initializer: R.() -> T) {
  private lateinit var value: T
  private var initialized = false

  operator fun getValue(thisRef: R, property: KProperty<*>): T {
    if (!initialized) {
      value = initializer(thisRef)
      initialized = true
    }
    return value
  }
}

class MyClass(val foo: String)

val MyClass.length by CustomLazy<MyClass, String> { foo.length.toString() }

println(MyClass("bar").length + MyClass("kotlin").length)

// What will it print?
// a) 33
// b) 36
// b) UninitializedPropertyAccessException
// d) will not compile

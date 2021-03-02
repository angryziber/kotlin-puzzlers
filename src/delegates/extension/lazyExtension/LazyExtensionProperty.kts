// by Tobias Berger @tobiberger
package delegates.extension.lazyExtension

class MyClass(val foo: String)

val MyClass.length by lazy { foo.length.toString() }

println(MyClass("bar").length + MyClass("kotlin").length)

// What will it print?
// a) 33
// b) 36
// b) Lazy value not initialized yet.Lazy value not initialized yet.
// d) will not compile

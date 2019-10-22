// by Paul Finkelshteyn

inline fun some(
   param1: () -> String = {"${param2} World"},
   param2: String = "Hello"
) = println(param1())

some()

// What will it print?
// a) Hello World
// b) null World
// c) NullPointerException
// d) None of the above

Correct answer: **c) 1  2 -3**

* The built-in operator [`Int.plus(Int)`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/plus.html) wins over the extension function, [because](https://github.com/JetBrains/kotlin/blob/master/spec-docs/NameResolution.adoc#name-resolution-for-a-call-with-an-explicit-receiver) it's declared as a member function
* The [built-in operator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/plus.html) is not *infix*, so only for infix variant our extension is used
* In case of operator and infix function call unary `-` is applied first, but a normal function call (operator `.`) has higher [precedence](https://kotlinlang.org/docs/reference/grammar.html#precedence), so `-(1.plus(2))` is compiled.

Inspired by [zhangdatou](https://discuss.kotlinlang.org/t/1-plus-2-3/2182)

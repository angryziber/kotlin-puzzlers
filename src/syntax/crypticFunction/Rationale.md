Correct answer: **a) kotlin.Unit**

* `{->}` is actually the same as `{}`, i.e. a `Function<Unit>`
* `fun Function<*>.() {}` is an anonymous extension function on `Function<*>`
  * that returns `Unit`
  * which is run immediately on the receiver `{->}`
  * It is the same as `{}.(fun Function<*>.(): Unit {})()`
  * Or more detailed:
  
```
val function = { -> }
val anonymous = fun Function<*>.(): Unit {}
val whatAmI = function.anonymous()
```

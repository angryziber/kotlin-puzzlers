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

Watch [KotlinConf 2018 - Kotlin Puzzlers, vol 2 by Anton Keks 46:42](https://www.youtube.com/watch?v=Xq9vBZs0j-8&lc=UgzrxmtADpeVJWbzo-14AaABAg#t=46m42s)

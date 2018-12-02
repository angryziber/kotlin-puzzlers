Correct answer: **b) C; null**

* Singleton objects are initialized in an order determined by trying to topologically sort them by their dependencies.
* In case of an initialization cycle a complete topological sort is impossible, and it is possible to observe the value of an object involved in the cycle as `null`.
* If the constructor of `A` takes non-nullable parameter, like `open class A(val x: Any)`, it throws an exception.
* See http://jetbrains.github.io/kotlin-spec/#_singleton_objects

Watch [KotlinConf 2018 - Kotlin Puzzlers, vol 2 by Anton Keks 43:45](https://www.youtube.com/watch?v=Xq9vBZs0j-8&lc=UgzrxmtADpeVJWbzo-14AaABAg#t=43m45s)

Correct answer: **b) C; null**

* Singleton objects are initialized in an order determined by trying to topologically sort them by their dependencies.
* In case of an initialization cycle a complete topological sort is impossible, and it is possible to observe the value of an object involved in the cycle as `null`.
* If the constructor of `A` takes non-nullable parameter, like `open class A(val x: Any)`, it throws an exception.
* See http://jetbrains.github.io/kotlin-spec/#_singleton_objects
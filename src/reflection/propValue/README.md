Correct answer: **d) Will not compile**

* `user:class` is of type `KClass<out User>` and out projection doesn't allow calling of `get()` method on the KProperty
* `User::class` will compile, but will not allow to do dynamic things

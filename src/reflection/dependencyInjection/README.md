Correct answer: **d) Will not compile**

* `KClass<out Any>` cannot be cast to `KClass<Any>`
* Can be fixed by using `KClass<*>` in method signature

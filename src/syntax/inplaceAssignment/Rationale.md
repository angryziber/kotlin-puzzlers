Correct answer: **b) BarFoo**

* In Kotlin, assignments are not expressions (e.g. they don't return a value)
    * Therefore, multiple assignments `x = y = 123` are not supported
* `f(x = y)` syntax is only for passing of parameters by name

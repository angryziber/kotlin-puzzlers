Correct answer: **d) None of the above** - compiler crashes (as of Kotlin 1.3.61)

https://youtrack.jetbrains.com/issue/KT-34407

* If `inline` is removed, then **b)** is correct
* `param2` value is captured before it is initialized
* Change to `param2: () -> String = {"Hello"}` and you get the **c)**
* Do not use default parameters in wrong order. Maybe compiler should give an error?
* Kotlin/JS works as expected and produces **a)**

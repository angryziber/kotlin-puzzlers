Correct answer: **d) None of the above** - compiler crashes (as of Kotlin 1.3.50)

* If `inline` is removed, then **b)** is correct
* `param2` value is captured before it is initialized
* Change to `param2: () -> String = {"Hello"}` and you get the **c)**
 
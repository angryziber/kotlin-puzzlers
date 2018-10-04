Correct answer: **a) Yes**

* Exhaustive check on sealed classes does not happen when it is checked in a statement. Convert the check into expression as:- 
```
val out = when (h) {
    is Dog -> println("It is a Dog")
}
```
* More info at [Kotlin Sealed Classes](http://kotlinlang.org/docs/reference/sealed-classes.html)

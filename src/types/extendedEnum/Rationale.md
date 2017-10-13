Correct answer: ***d) will not compile***

* Extension functions on Color apply to instances of Color, e.g. `Color.Blue.from()`
* Extension function on the enum itself can be made only if it has a Companion object
```
    enum class Color {
      Red, Green, Blue;
      companion object 
    }

    fun Color.Companion.from(...)
```

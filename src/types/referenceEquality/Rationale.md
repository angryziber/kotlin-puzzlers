Correct answer: **c) true; false**

* Integer caches values in the range `[-128, 127]`. The value `128` is out of the range so boxing of the value creates a new instance of `Integer` rather than using a cached value.
* More info at [Kotlin boxed Int are not the same - Stack Overflow](https://stackoverflow.com/questions/45139381/kotlin-boxed-int-are-not-the-same/45144516#45144516)

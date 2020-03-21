Correct answer: **c) An exception** - stack overflow

* `toData()` is called recursively from flatMap() on the same instance
* Change to `it.toData()` inside of flatMap to get **a)**
* Removing of explicit type of `toData()` will break compilation (TODO: why?)
* Elegant, but not the most efficient code
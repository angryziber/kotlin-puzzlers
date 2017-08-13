Correct answer: **c) kotlin.Unit**

* `throw` and `return` statements evaluate to `Nothing`
* `Nothing` is a subtype of any other type, so can be assigned to `Unit`
* `Unit` is the default return type of functions
* More info at [Whirlwind Tour of the Kotlin Type Hierarchy](http://natpryce.com/articles/000818.html)

Correct answer: **a) Hello**

* The innermost `return` does it job and returns "Hello"
* In Kotlin everything (except assignment) is an expression
* `return` and `throw` expressions result in `Nothing`
* `Nothing` can never be instantiated, but is assignable to all other types
* That's why you can throw Nothing and return Nothing again, and even assign it to a variable

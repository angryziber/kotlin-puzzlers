Correct answer: **c) 1() -> kotlin.Unit**

* Lambda body can follow the function brackets `()`, even if on a different line
    * ... and there's a comment in between
    * Try uncommenting the `//print("Debug")` statement to make code not compile anymore
* The lambda will after second test() will print 1
* Second lambda is not executed, but .kts files now print the last statement

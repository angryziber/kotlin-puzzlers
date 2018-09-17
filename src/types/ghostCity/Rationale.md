Correct answer: **a) Tallinn**

* Inline classes generally don't exist in runtime
* "Inline class is boxed when it is used as another type"
  https://github.com/Kotlin/KEEP/blob/master/proposals/inline-classes.md
  * println() probably is an exception, because it has a println(String) signature
  * inlining *my* variable produces the result **b)**, inline refactoring is not safe anymore  
  * hopefully this will be fixed when inline classes stop being experimental
  
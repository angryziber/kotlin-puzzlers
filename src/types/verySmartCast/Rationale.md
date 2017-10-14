Correct answer: **a) 123**

* Compiler does not check for *impossible* conditions
* Smart cast of `x` works for both Int and String at the same time
  * This should be useful when checking for interfaces
* Code compiles, but condition that would lead to ClassCastException is never true  

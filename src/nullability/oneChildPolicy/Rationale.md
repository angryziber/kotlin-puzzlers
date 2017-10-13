Correct answer: ***b) in child1; in parent***

* `T.apply()` can be called on anything, including nulls
* `child1?.apply` with `?.` ensures that `lookup()` is called on the child itself, if it is non-null (which it is)
* `child2.apply` is called on nullable `Node`, so `lookup()` on it is impossible, therefore parent's `lookup()` is preferred
* Compiler/IDEA definitely needs an ambiguity warning here
* Use `also()` instead of `apply()`

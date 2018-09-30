Correct answer: **b) 'Tallinn'**

* Instances of inline classes generally are not created in runtime
* Except for when they are passed as supertypes (e.g. Any), then they are boxed
  https://github.com/Kotlin/KEEP/blob/master/proposals/inline-classes.md
* Kotlin 1.3 M versions did use the unboxed version when used with a variable resulting in answer **a)**
  
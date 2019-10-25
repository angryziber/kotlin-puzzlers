Correct answer: **d) Will not compile**

* `==` call `.equals`, but compiler refuses to call it on obviously different types
* if you change type of `a` to `Any`, you will get **c) Nothing**
    * `else` branch is applied to the second, not the first `if`
    * Unfortuantely, "suspicious indentation" inspection exists only for Java in IDEA
    * Code in Python to avoid this problem

Correct answer: **d) none of the above (NullPointerException)**

* `c.length` is accessed before `c` is initialized
* Kotlin compiler tries hard to avoid NPE, but sometimes it is not smart enough
* KNPE is another case - when you explicitly use `!!` to dereference a null

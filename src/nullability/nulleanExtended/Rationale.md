Correct answer: ***a) true***

* `String?.isNullOrEmpty()` is an extension function for nullable String
* Extension functions can be applied to nulls, because in JVM they actually are
  `boolean isNullOrEmpty(String s)`
* This is a library workaround for the Nullean problem
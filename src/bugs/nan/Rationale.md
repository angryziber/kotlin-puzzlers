Correct answer: **c) It depends**

* 0.0 / 0.0 == NaN
* According to floating point spec, NaN != NaN
* In JVM, it works for primitives, but not for the same wrapped object (because .equals() checks for reference equality first)

As of Kotlin 1.3.60:
When running from .kts file it returns *false*, but when pasted to kotlinc it returns *true*

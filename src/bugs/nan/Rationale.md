Correct answer: **d) It depends**

As of Kotlin 1.3.60:
When running from .kts file it returns *false*, but when pasted to kotlinc it returns *true*

Explanation for true:
Compiler ignores smart cast to Double and compares numbers like Objects, i.e. using equals() method. And equals() method returns true if it compares two NaNs.

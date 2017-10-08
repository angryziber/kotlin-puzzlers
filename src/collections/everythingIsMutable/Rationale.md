Correct answer: **c) `UnsupportedOperationException`**

Helper functions such as `listOf()`, `Array.asList()`, etc, return `java.util.Arrays$ArrayList` instead of `java.util.ArrayList`, which does not support mutation.

Correct answer: **b) An exception - ExceptionInInitializerError**

* The error() function that it called is not the one in the enum, but the one from stdlib kotlin.util.Preconditions:

```
public inline fun error(message: Any): Nothing = throw IllegalStateException(message.toString())
```

Author:
I spent about 3 hours to find why. As it turned out there is Intelij Idea bug: if you ask Idea: "Where is error function declared", it will say: "In enum class Errors", but it's not true.
To fix this, you need to move error function out of enum

IDEA bug: https://youtrack.jetbrains.com/issue/KT-30839

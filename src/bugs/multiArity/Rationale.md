The correct answer is **b) 0**.

While IDE shows that “Check for instance is always 'true'” for both `is` expressions,
only first one will be successful.

The cause of [this bug](https://youtrack.jetbrains.com/issue/KT-24067) is that
instead of generating normal INSTANCEOF (or CHECKCAST)
compiler inserts a call to `kotlin.jvm.internal.TypeIntrinsics.isFunctionOfArity`
which internally uses `getFunctionArity` declared as follows:

```java
public static int getFunctionArity(Object obj) {
    if (obj instanceof FunctionBase) {
        return ((FunctionBase) obj).getArity();
    }
    else if (obj instanceof Function0) {
        return 0;
    }
    else if (obj instanceof Function1) {
        return 1;
    }
    …
    else if (obj instanceof Function22) {
        return 22;
    }
    else {
        return -1;
    }
}
```
 
Thus, Kotlin compiler expects functions to have only one arity.
 
Correct answer: **d) None of the above - 1 4 7**

Because (1) `step` overwrites the previous step and constructs a new object ([Kotlin sources](https://github.com/JetBrains/kotlin/blob/deb416484c5128a6f4bc76c39a3d9878b38cec8c/libraries/stdlib/common/src/generated/_Ranges.kt#L576-L579)):
```kotlin
public infix fun IntProgression.step(step: Int): IntProgression {
    checkStepIsPositive(step > 0, step)
    return IntProgression.fromClosedRange(first, last, if (this.step > 0) step else -step)
}
```

And (2) in the new object the last element is recalculated ([Kotlin sources](https://github.com/JetBrains/kotlin/blob/7c6f48df39ff8c7cd9dfba3398bde5efb2390a08/core/builtins/src/kotlin/internal/progressionUtil.kt#L45-L49)):
```kotlin
internal fun getProgressionLastElement(start: Int, end: Int, step: Int): Int = when {
    step > 0 -> if (start >= end) end else end - differenceModulo(end, start, step)
    step < 0 -> if (start <= end) end else end + differenceModulo(start, end, -step)
    else -> throw kotlin.IllegalArgumentException("Step is zero.")
}
```

So `1..10 step 2` becomes `1..9 step 2` because of (2).  
Then `1..9 step 2 step 3` becomes `1..9 step 3` because of (1)  
and finally becomes `1..7 step 3` because of (2) again. 

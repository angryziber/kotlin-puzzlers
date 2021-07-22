Correct answer: **d) Will not compile**

* Compilation error is very strange: `Class 'MyAtomicInteger' is not abstract and does not implement abstract base class member public abstract fun toByte(): Byte defined in java.util.concurrent.atomic.AtomicInteger`
* Actually, it also requires implementing of `public abstract fun toChar(): Char` and `public abstract fun toShort(): Short` allegedly defined in `java.util.concurrent.atomic.AtomicInteger`
* But `java.util.concurrent.atomic.AtomicInteger` is not abstract, moreover nor it, neither any of its ancestors defines any of these methods
* `java.util.concurrent.atomic.AtomicInteger` extends abstract `java.lang.Number` class
* Kotlin defines its out abstract `kotlin.Number` class, which is a [mapped type](https://kotlinlang.org/docs/reference/java-interop.html#mapped-types) for `java.lang.Number`.
* This is the one, who defines all those abstract methods and implicitly become a new ancestor of `java.util.concurrent.atomic.AtomicInteger` making it to require its descendants to implement unmapped abstract methods of `kotlin.Number`.
* `toChar()` method indeed have no direct mapping in java, but why it is complaining about `toByte()` and `toShort()`, while their counterparts (`byteValue()` and `shortValue()` respectfully) are available in `java.util.concurrent.atomic.AtomicInteger`?
* This is because they are defined not in `java.util.concurrent.atomic.AtomicInteger` directly, but in `java.lang.Number`, which is substituted by `kotlin.Number` during this mapping procedure itself.
* If `java.util.concurrent.atomic.AtomicInteger` would have overridden those methods (or had some intermediate ancestors who had overridden them) then it would be only `toChar()` left to implement.
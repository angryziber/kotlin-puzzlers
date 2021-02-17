Correct answer: **will not compile**

Compiling version:
```
inline fun <reified T : Any> T.toValues(): Map<String, Any?> =
    T::class.memberProperties.associate { it.name to it.get(this) }
```

The reason is that compiler doesn't see the relation that `this::class` could be type-safe
in this case and thinks it is more dynamic, returning `KClass<out T>` instead of `KClass<T>`, like the reified version.

### Marc Knaup on Kotlin slack:
this is T (or any subclass) and this::class is KClass<out T> means the KClass of T  (or any subclass).
get() expects “T or any subclass” and this is “T or any subclass”. The compiler doesn’t know that both are the same subclass.
If you are able to use reified and thus T::class then you get KClass<T> which means the KClass of exactly T. (edited) 

### ephemient on Kotlin slack:

```fun T.getClass(): KClass<T> = this::class```
cannot be correct, as if you call it within a
```
val foo: Any = 1
val fooClass = foo.getClass()
```
you'd end up with fooClass: KClass<Any> which is not correct 

Correct answer: **b) null**

* cast to Nothing stops subsequent type checks, as getting an instance of Nothing should be impossible 
* Change return type of the function to `Nothing` to get an NPE
* Or change last lines of the function to break the compiler (error: bad type on operand stack):

```
val nothing = unsafe.allocateInstance(Nothing::class.java) as Nothing
println(if (nothing) {}.toString())
```

this code throws java.lang.VerifyError. It means that Kotlin compiled wrong bytecode. Let's look on the wrong bytecode line:

    CHECKCAST java/lang/Void
    ASTORE 1
    ALOAD 1
    INVOKEVIRTUAL kotlin/Unit.toString ()Ljava/lang/String;

As we can see, we try to invoke kotlin.Unit.toString() on java.lang.Void instance

Unsafe is indeed unsafe :-)

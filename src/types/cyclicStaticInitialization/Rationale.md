### Part 1

Correct answer: **c) ExceptionInInitializerError**

* When `B.b` is evaluated, first the `B` class is loaded, which causes the the `A` class to be loaded (since `A` extends `B`). When the `A` class is loaded, it's static initializer is run, and then finally the static initializer of `B` can be run. This is how static initializers work in Java.
* `B`'s static initializer is responsible for creating `B.INSTANCE` (the instance of the `B` object).
* `A`'s static initializer is responsible for creating `A.Companion` (the instance of the `A`'s companion object). When this initializer is run, `A.Companion.a` is assigned `B.INSTANCE.getB()`.
* Because `A`'s static initializer is invoked before `B`'s, `B.INSTANCE` is `null` causing a `NullPointerException` when calling `getB()`, this causes the `ExceptionInInitializerError`. 

### Part 2

Correct answer: **a) hello hello**

* Because we call `A.a` first, the `A` class is loaded, running it's static initializer. When `A`'s static initializer loads `B.INSTANCE`, the `B` class is loaded and it's static initializer is run.
* `B`'s static initializer initializes `B.INSTANCE` without invoking `A`'s static initializer (since `A` is already loaded). So when `A`'s static initializer invokes `getB()`, `B.INSTANCE` is not null and the code works as expected.

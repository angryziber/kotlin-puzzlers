Correct answer: **will not compile**

* Extension functions and properties are independent of the receiver object (like static Java methods)
* The delegate is just an object that handles getter/setter calls. 
* For extension properties, this is a single shared delegate istance
* When defining a delegated property inside a class body, it will be initialized as part of the constructor, giving it access to `this` as well as constructor parameters. 
* When it is defined as an extension property it will be initialized just once while it is loaded. No receiver object is present at that point, so `foo` doesn't exist in that scope.

The issue may become clearer when looking at how delegates work.

This setup
```
val MyClass.length by lazy { foo.length.toString() }
```
is basically equivalent to this (almost valid syntax)
```
val delegate = lazy { foo.length.toString() }
val MyClass.length
  get() = delegate.getValue(this, MyClass::length)
```
Here you can clearly see that there is no way for the lambda to know what `foo` is.

The `getValue` implementation of `Lazy` ignores the input parameters. It could theoretically use the reference that is passed here to access a receiver object. But you still need to consider that you only have a single delegate object for all receivers (also see [ThisRefExtensionProperty.kts](../thisRef/ThisRefExtensionProperty.kts))
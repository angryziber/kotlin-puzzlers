Correct answer: **b) null**

* cast to Nothing stops subsequent type checks, as getting an instance of Nothing should be impossible 
* Change return type of the function to `Nothing` to get an NPE
* Or change last lines of the function to break the compiler (error: bad type on operand stack):
```
  val nothing = unsafe.allocateInstance(Nothing::class.java) as Nothing
  println(if (nothing) {}.toString())
```

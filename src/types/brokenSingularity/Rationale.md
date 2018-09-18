Correct answer: **d) none of the above - ArrayIndexOutOfBoundsException**

* Unit is an object
* While it has a constructor, it is private and must be accessed via *declaredConstructors*
* Once the second instance is created, it is not equal to Unit
* Beware, because some deserialization libraries (e.g. from json) can produce these easily
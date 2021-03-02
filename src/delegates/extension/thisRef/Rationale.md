Correct answer: **33**

* Extension functions and properties are independent of the receiver instance (like static Java methods)
* The delegate is an instance that handles getter/setter calls. 
* For extension properties, this is a single shared delegate instance
* The value in this single instance is only initialized once and then returns the same result for all receivers

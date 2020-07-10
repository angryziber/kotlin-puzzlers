Correct answer: **will not compile**

* Extension functions and properties are independent of the receiver instance (like static Java methods)
* The delegate is an instance that handles getter/setter calls. 
* For extension properties, this is a single shared delegate instance
* The extension is initialized independently of any instance, so the delegate can't use any instance properties

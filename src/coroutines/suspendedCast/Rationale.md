Correct answer: **a) 42**

* All *suspend* functions have Object as return type (that's why there is no ClassCastException) 
* `suspendCoroutineUninterceptedOrReturn()` allows you to return anything regardless return type (its needed for some library functions)

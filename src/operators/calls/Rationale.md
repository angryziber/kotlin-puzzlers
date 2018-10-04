Correct answer: **a) "fun called"**

* `val` shadows the parameter
* No idea why `fun` is picked over `val`  
  seeking clarification in https://stackoverflow.com/q/51800008/253468
* Even though the `fun` is preferred, it's possible to call the `val` as well:
  * `(toCall)("called")`
  * `toCall.invoke("called")`

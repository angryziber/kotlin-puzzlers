Correct answer: **b) [2]**

* Languges without semicolons need to make decisions when a statement ends
  * Lines starting with '+' can be interpreted as starting with unary '+'
  * Groovy has the same problem, but JavaScript hasn't
  * Fix by keeping '+' on the previous line
* Unfortunately, there are no plans on fixing [this](https://youtrack.jetbrains.com/issue/KT-3393)   

[Story and longer explanation](https://android.jlelse.eu/why-i-missed-semi-colons-today-e2fb136f58e5)
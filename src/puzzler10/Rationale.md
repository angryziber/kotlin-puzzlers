Correct answer: **c)** bar

* `this` can be sneaky in extension functions
* `return` from a lambda (if allowed) affects the outer function
* Function return type inference allows to miss the mistake
  - but compiler will probably catch it at the point of use
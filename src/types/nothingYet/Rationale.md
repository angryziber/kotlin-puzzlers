Correct answer: **b) kotlin.Unit**

* Kotlin compiler actively uses data-flow information.
  An object of type `Nothing` cannot appear regularly in the code,
  i.e., the rest of the code after `Nothing` should be unreachable,
  therefore, we don't need to thoroughly check this unreachable code,
  for example, for `if` expression exhaustiveness.
* Our `asGeneric<T>()` function uses an unsafe cast to *cheat* the type system
  into believing the code is unreachable, whereas it actually is reachable.
* At the moment (Kotlin 1.3), the backend compiles this `if`
  as if it returns `Unit`.

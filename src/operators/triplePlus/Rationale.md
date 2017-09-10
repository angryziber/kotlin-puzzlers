Correct answer: **c) 1  2 -3**

* The real operator Int.plus() hides the extension function
* The real one is not *infix*, so only for infix variant our extension is used
* Unary *-* is applied before operator and infix usage, but after the normal function call

Inspired by [zhangdatou](https://discuss.kotlinlang.org/t/1-plus-2-3/2182)

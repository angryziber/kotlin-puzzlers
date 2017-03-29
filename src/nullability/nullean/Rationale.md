Correct answer: ***d) Will not compile***

* Unlike Groovy, unfortunately *null* doesn't evaluate to false
* Replace with `s?.isEmpty() ?: false`
* Or good old `s != null && s.isEmpty()`
* Vote for [KT-5965](https://youtrack.jetbrains.com/issue/KT-5965)

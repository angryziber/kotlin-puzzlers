Correct answer: **d) Will not compile**

A property with a custom getter is treated by _smart cast_ differently because it can return different values. 

Conclusion: do not use a getter-only property just to save on a field 

    // no backing field here, so much more performant
    val x get() = 239
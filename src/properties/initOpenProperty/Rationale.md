Correct answer: **d) Will not compile**

This effect shows only for `open var` in classes.

This code is prohibited because code in the init block that could observe the property in its uninitialized state.

For more see [KT-10252](https://youtrack.jetbrains.com/issue/KT-10252)

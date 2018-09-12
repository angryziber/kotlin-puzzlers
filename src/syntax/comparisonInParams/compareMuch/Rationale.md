Correct answer: **d) will not compile**

* This is an example of *ambiguous parsing*
* The compiler cannot decide between these two options
    - `a<b, b> c [smth]` (i.e., a call to an infix function `c`
      on some generic property `a<b, b>`,
      which is missing an argument)
    - `a < b, b > c` (i.e., two regular comparisons)
* For better or worse, it picks the first option ¯\_(ツ)_/¯

> Workaround: wrap any of these comparisons in parentheses

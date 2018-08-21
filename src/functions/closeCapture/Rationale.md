Correct answer: **c) 3 1; 3 2; 3 3**

* It seems that for-loop variables are captured by value (they are like `val`)
* But mutable `var` variables are captured by reference
* In JavaScript, all variables are captured by reference
  and would result in **3 3; 3 3; 3 3** 

Source: 
https://discuss.kotlinlang.org/t/kotlin-is-even-more-confusing-than-js/7292

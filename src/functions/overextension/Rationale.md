Correct answer: **b) !xy**

* Real methods have precedence over extensions
  - source-level compatibility can be broken when new methods appear later
  - already compiled code will still work as expected
* toString() extension can be declared, but cannot be called
  - Produces 'extension is shadowed' warning
  
Watch [KotlinConf 2017 - Kotlin Puzzlers by Anton Keks 41:00](https://www.youtube.com/watch?v=ukwVzLq_pHk&lc=UgzH3QiIn1vLhtL2M0Z4AaABAg#t=41m00s)

Correct answer: **b) !x**

* Real methods have precedence over extensions
  - source-level compatibility can be broken when new methods appear later
  - already compiled code will still work as expected
* toString() extension can be declared, but cannot be called
  - Produces 'extension is shadowed' warning
  

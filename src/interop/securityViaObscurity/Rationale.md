Correct answer: **d) none of the above** (hello$module_name)

* `internal` is not package-local 
* has no equivalent in Java <= 8
* internal members are public on JVM, but have a suffix appended to them
  - to prevent being accidentally called from Java
* Java 9 modules may allow to fix this later  

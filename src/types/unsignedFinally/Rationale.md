Correct answer: **d) 0 -2 (none of the above)**

* UInt is an inline class masking a regular Int
* If you pass an inline class value to an Any parameter, it will get boxed
* But there seems to be a problem with decrementing and passing at the same time
* Probably a bug in compiler that will be fixed

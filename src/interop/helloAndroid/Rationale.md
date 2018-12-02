Correct answer: **d) Will not compile**

* `WeirdJava.Api` in Kotlin refers to the type, not the static member; this means that no methods can be called on it.
* `(WeirdJava.Api).run()` will refer to the member and call the right method
* another workaround is to store `private val Api = WeirdJava.Api` and call on this object `Api.run()`
* another workaround is to import the member: `import interop.helloAndroid.WeirdJava.Api` and `Api.run()`; strangely this will reference the member, not the type

TODO why?

This example is based on a real world interop problem when using Google Cast API from Kotlin: https://developers.google.com/android/reference/com/google/android/gms/cast/Cast.html#CastApi

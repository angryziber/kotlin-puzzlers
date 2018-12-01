Correct answer: **c) 0, 3, 6, 9**

 * `0..9` is an overloaded operator function call for `0.rangeTo(9)`
 * `rangeTo` produces an `IntRange : IntProgression, ClosedRange` object
 * `rangeTo` is an inclusive factory: `[from, to]`, while `until` would be exclusive at the end: `[from, to)`
 * `0..9` is therefore and `IntRange` over `0, 1, 2, 3, 4, 5, 6, 7, 8, 9`
 * `IntProgression.step` operates on this `IntRange` and creates an `IntProgression` object
 * this progression filters every 3rd number starting from the beginning, i.e. 1st, 4th, 7th and 10th = `0, 3, 6, 9`

`0..9 step 3` is an abbreviation of `0.rangeTo(9).step(3)` which can also be expressed as the following coroutine generator loop:

```kotlin
val range = iterator<Int> {
	var i = 0
	while (i <= 9) {
		yield(i)
		i += 3
	}
}
```

 * `Iterable.joinToString` iterates through each value and joins them with a default `", "` separator
 * `IntProgression.toString` would output `0..9 step 3`

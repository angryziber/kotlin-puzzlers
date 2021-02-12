Correct answer: **b) false**

 * `0..10` is an overloaded operator function call for `0.rangeTo(10)`
 * `rangeTo` produces an `IntRange : IntProgression, ClosedRange` object
 * `rangeTo` is an inclusive factory: `[from, to]`, while `until` would be exclusive at the end: `[from, to)`
 * `0..10` is therefore and `IntRange` over `0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10` (11 values)
 * `IntProgression.step` operates on this `IntRange` and creates an `IntProgression` object
 * `range.reversed().step(3)`
   * `reversed` flips the order of the `IntRange` to `10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0` (11 values)
   * `step` filters every 3rd number starting from the beginning in this reversed range, i.e. 1st, 4th, 7th and 10th = `10, 7, 4, 1`
 * `range.step(3).reversed()`
   * `step` filters every 3rd number starting from the beginning, i.e. 1st, 4th, 7th and 10th = `0, 3, 6, 9`
   * these are then `reversed` to `9, 6, 3, 0`
 * `==` on two `List`s will compare the list elements one by one and they won't match
 * Starting with `range = 0..9` would result in `true`, due to the last item being included in the progression, so `reserved` is symmetric.

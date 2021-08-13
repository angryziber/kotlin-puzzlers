Correct answer: **b) 0**

The loop first iteratively sets all the bits of the `result` signed `Int`. When all bits are set `result` will
therefore have the value `-1`. However, the range over which the loop iterates actually includes `32`. And similar to
Java's bitwise shift operators, Kotlin's `shl`, `shr` and `ushr` actually only use the lowest 5 bits of the shift
distance:
> Note that only the five lowest-order bits of the bitCount are used as the shift distance. The shift distance
> actually used is therefore always in the range 0..31.

That is why, opposed to what one might expect, `1 shl 32` results in 1, and `-1 + 1 = 0`.

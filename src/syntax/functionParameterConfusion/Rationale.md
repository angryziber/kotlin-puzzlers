Correct answer: **d) None of the above** - the created string is actually `" + , + , + "`

`joinToString` has a default argument for every parameter, including the _separator_. The code uses curly brackets
(`{ ... }`) which therefore represents the _transform_ function, transforming every element. The parameter (`it`) of
the transform function was omitted.

The lesson from this: Pay attention to the difference between parentheses and curly brackets and verify that you are
passing a value for the correct parameter. Also be careful when using suggestions from the IDE, here IntelliJ IDEA
would have suggested the variant with _transform_ function first.

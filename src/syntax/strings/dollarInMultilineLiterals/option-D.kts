package syntax.strings.dollarInMultilineLiterals

// Which of the following string literals would represent a Linux command for deleting $HOME directory?
// `rm -rf $HOME/*`

// Option D:
val deleteHomeDirD = """ rm -rf $$HOME/* """
println(deleteHomeDirD)

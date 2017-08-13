package syntax.strings.dollarInMultilineLiterals

// Which of the following string literals would represent a Linux command for deleting $HOME directory?
// `rm -rf $HOME/*`

// Option B:
val deleteHomeDirB = """ rm -rf "$HOME/*" """
println(deleteHomeDirB)

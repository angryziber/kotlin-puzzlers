package syntax.strings.dollarInMultilineLiterals

// Which of the following string literals would represent a Linux command for deleting $HOME directory?
// `rm -rf $HOME/*`

// Option C:
val deleteHomeDirC = """ rm -rf \$HOME/* """
println(deleteHomeDirC)

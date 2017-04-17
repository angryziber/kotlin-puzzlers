package syntax.strings.dollarInMultilineLiterals

// Which of the following string literals would represent a Linux command for deleting $HOME directory?
// `rm -rf $HOME/*`

// Option F:
val deleteHomeDirF = """ rm -rf $$\bHOME/* """
println(deleteHomeDirF)

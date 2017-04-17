package syntax.strings.dollarInMultilineLiterals

// Which of the following string literals represents a Linux command for deleting $HOME directory?
// `rm -rf $HOME/*`

// a)
val deleteHomeDirA = """ rm -rf $HOME/* """
// b)
val deleteHomeDirB = """ rm -rf "$HOME/*" """
// c)
val deleteHomeDirC = """ rm -rf \$HOME/* """
// d)
val deleteHomeDirD = """ rm -rf $$HOME/* """
// e)
val deleteHomeDirE = """ rm -rf `$`HOME/* """
// f)
val deleteHomeDirF = """ rm -rf $$\bHOME/* """
// g) None of the above
Correct answer: **d) Will not compile**

It is because the *only* special character in a multiline literal is `$`, and it can't be escaped. 

If you need a string like `"""$HOME"""` without it resolving to a variable `HOME`, use `${'$'}` instead of `$`. 

An improvement over this is to `import kotlin.text.Typography.dollar`:

    import kotlin.text.Typography.dollar

    val str = """${dollar}HOME"""

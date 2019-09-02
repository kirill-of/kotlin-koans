package pro.ofitserov.kotlin._1_introduction._5_String_Templates

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern() = """\d{2}\ ${month}\ \d{4}"""

fun main(args: Array<String>) {
    println("11 MAR 1952".matches(getPattern().toRegex()))

    println("11 MAP 1952".matches(getPattern().toRegex()))
}
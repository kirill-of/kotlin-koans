package pro.ofitserov.kotlin._2_conventions._6_Destructuring_declarations

/*
Destructuring declarations

Read about destructuring declarations and make the following code compile by adding one word.
*/

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

fun isLeapDay(date: MyDate): Boolean {

    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}
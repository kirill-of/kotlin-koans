package pro.ofitserov.kotlin._2_Conventions._3_Range_to

/*
Range to

Implement the function MyDate.rangeTo(). This allows you to create a range of dates using the following syntax:

MyDate(2015, 5, 11)..MyDate(2015, 5, 12)
Note that now the class DateRange implements the standard ClosedRange interface and inherits contains method implementation.
 */

operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)

class DateRange(override val start: MyDate, override val endInclusive: MyDate) : ClosedRange<MyDate>

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}
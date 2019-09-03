package pro.ofitserov.kotlin._2_conventions._2_In_range

/*
In range

In Kotlin in checks are translated to the corresponding contains calls:

val list = listOf("a", "b")
"a" in list  // list.contains("a")
"a" !in list // !list.contains("a")
Add a method fun contains(d: MyDate) to the class DateRange to allow in checks with a range of dates.
 */

class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(item: MyDate): Boolean = start <= item && item <= endInclusive
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}


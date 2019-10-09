package pro.ofitserov.kotlin._1_Introduction._11_SAM_Conversions

/*
SAM conversions

When an object implements a SAM interface (one with a Single Abstract Method), you can pass a lambda instead.

In the previous example change an object expression to a lambda.
 */

import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y - x })
    return arrayList
}
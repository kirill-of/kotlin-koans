package pro.ofitserov.stepik._1_introduction._1_Java_To_Kotlin_Converter

/*
We have a handy tool for Java developers: Java to Kotlin converter.

To become familiar with it, please convert the java function toJSON in the file JavaCode.java.

You can just copy-paste the code to Kotlin file and agree to automatically convert it to Kotlin.
 */

fun toJSON(collection: Collection<Int>): String {
    val sb = StringBuilder()
    sb.append("[")
    val iterator = collection.iterator()
    while (iterator.hasNext()) {
        val element = iterator.next()
        sb.append(element)
        if (iterator.hasNext()) {
            sb.append(", ")
        }
    }
    sb.append("]")
    return sb.toString()
}
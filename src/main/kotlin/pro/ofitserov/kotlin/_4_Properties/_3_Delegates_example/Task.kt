package pro.ofitserov.kotlin._4_Properties._3_Delegates_example

/*Delegates example

Read about delegated properties and make the property lazy by using delegates.*/

class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}
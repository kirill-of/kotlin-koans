package pro.ofitserov.kotlin._3_Collections._1_Introduction

/*Introduction

This part was inspired by GS Collections Kata.
Default collections in Kotlin are Java collections, but there are lots of useful extension functions for them.
For example, operations that transform a collection to another one, starting with 'to': toSet or toList.
Implement an extension function Shop.getSetOfCustomers(). The class Shop and all related classes can be found at Shop.kt.*/

fun Shop.getSetOfCustomers(): Set<Customer> = this.customers.toSet()

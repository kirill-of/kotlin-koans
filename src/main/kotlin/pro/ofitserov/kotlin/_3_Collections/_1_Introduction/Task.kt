package pro.ofitserov.kotlin._3_Collections._1_Introduction

import pro.ofitserov.kotlin._3_Collections._2_Filter_map.Customer
import pro.ofitserov.kotlin._3_Collections._2_Filter_map.Shop

/*Introduction

This part was inspired by GS Collections Kata.
Default collections in Kotlin are Java collections, but there are lots of useful extension functions for them.
For example, operations that transform a collection to another one, starting with 'to': toSet or toList.
Implement an extension function Shop.getSetOfCustomers(). The class Shop and all related classes can be found at Shop.kt.*/

fun Shop.getSetOfCustomers(): Set<Customer> = this.customers.toSet()

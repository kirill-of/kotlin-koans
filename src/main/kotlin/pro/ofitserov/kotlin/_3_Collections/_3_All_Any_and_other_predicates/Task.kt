package pro.ofitserov.kotlin._3_Collections._3_All_Any_and_other_predicates

import pro.ofitserov.kotlin._3_Collections._2_Filter_map.City
import pro.ofitserov.kotlin._3_Collections._2_Filter_map.Customer
import pro.ofitserov.kotlin._3_Collections._2_Filter_map.Shop

/*All, Any and other predicates

Implement all the functions below using all, any, count, find.

val numbers = listOf(-1, 0, 2)
val isZero: (Int) -> Boolean = { it == 0 }
numbers.any(isZero) == true
numbers.all(isZero) == false
numbers.count(isZero) == 1
numbers.find { it > 0 } == 2*/

// Return true if all customers are from the given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all { it.city == city }

// Return true if there is at least one customer from the given city
fun Shop.hasCustomerFrom(city: City): Boolean = customers.any { it.city == city }

// Return the number of customers from the given city
fun Shop.countCustomersFrom(city: City): Int = customers.count { it.city == city }

// Return a customer who lives in the given city, or null if there is none
fun Shop.findAnyCustomerFrom(city: City): Customer? = customers.find { it.city == city }
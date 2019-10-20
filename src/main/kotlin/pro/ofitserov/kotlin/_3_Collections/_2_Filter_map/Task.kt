package pro.ofitserov.kotlin._3_Collections._2_Filter_map

import pro.ofitserov.kotlin._3_Collections._3_All_Any_and_other_predicates.City
import pro.ofitserov.kotlin._3_Collections._3_All_Any_and_other_predicates.Customer
import pro.ofitserov.kotlin._3_Collections._3_All_Any_and_other_predicates.Shop

/*Filter; map

Implement extension functions Shop.getCitiesCustomersAreFrom() and Shop.getCustomersFrom() using functions map and filter.
val numbers = listOf(1, -1, 2)
numbers.filter { it > 0 } == listOf(1, 2)
numbers.map { it * it } == listOf(1, 1, 4)*/

// Return the set of cities the customers are from
fun Shop.getCitiesCustomersAreFrom(): Set<City> = customers.map { it.city }.toSet()

// Return a list of the customers who live in the given city
fun Shop.getCustomersFrom(city: City): List<Customer> = customers.filter { it.city == city }
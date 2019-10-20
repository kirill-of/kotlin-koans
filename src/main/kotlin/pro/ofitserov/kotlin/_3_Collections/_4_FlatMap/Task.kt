package pro.ofitserov.kotlin._3_Collections._4_FlatMap

import pro.ofitserov.kotlin._3_Collections._Test_Data.Customer
import pro.ofitserov.kotlin._3_Collections._Test_Data.Product
import pro.ofitserov.kotlin._3_Collections._Test_Data.Shop

/*FlatMap

Implement Customer.getOrderedProducts() and Shop.getAllOrderedProducts() using flatMap.

val result = listOf("abc", "12").flatMap { it.toCharList() }
result == listOf('a', 'b', 'c', '1', '2')*/

// Return all products this customer has ordered
fun Customer.getOrderedProducts(): Set<Product> = orders.flatMap { it.products }.toSet()

// Return all products that were ordered by at least one customer
fun Shop.getAllOrderedProducts(): Set<Product> = customers.flatMap { it.getOrderedProducts() }.toSet()
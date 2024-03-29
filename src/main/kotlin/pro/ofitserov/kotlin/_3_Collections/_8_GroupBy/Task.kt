package pro.ofitserov.kotlin._3_Collections._8_GroupBy

/*Group By

Implement Shop.groupCustomersByCity() using groupBy.

val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length() }
result == mapOf(1 to listOf("a", "b"), 2 to listOf("ba", "ad"), 3 to listOf("ccc"))*/

// Return a map of the customers living in each city
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> = customers.groupBy { it.city }
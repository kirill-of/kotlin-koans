package pro.ofitserov.kotlin._3_Collections._2_Filter_map

import pro.ofitserov.kotlin._3_Collections._3_All_Any_and_other_predicates.City
import pro.ofitserov.kotlin._3_Collections._3_All_Any_and_other_predicates.Customer
import pro.ofitserov.kotlin._3_Collections._3_All_Any_and_other_predicates.Order
import pro.ofitserov.kotlin._3_Collections._3_All_Any_and_other_predicates.Product

data class Shop(val name: String, val customers: List<Customer>)

data class Customer(val name: String, val city: City, val orders: List<Order>) {
    override fun toString() = "$name from ${city.name}"
}

data class Order(val products: List<Product>, val isDelivered: Boolean)

data class Product(val name: String, val price: Double) {
    override fun toString() = "'$name' for $price"
}

data class City(val name: String) {
    override fun toString() = name
}
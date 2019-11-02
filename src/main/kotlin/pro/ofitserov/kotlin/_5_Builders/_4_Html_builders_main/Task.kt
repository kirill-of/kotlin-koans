package pro.ofitserov.kotlin._5_Builders._4_Html_builders_main

import getProducts
import html
import table
import td
import text
import tr

/*Html builder

1. Fill the table with the proper values from the product list. The products are declared in data.kt.

2. Color the table like a chess board (using getTitleColor() and getCellColor() functions above).
Pass a color as an argument to the functions tr, td.

Open the file demo.kt and run the main function there to see the rendered table.*/

fun renderProductTable(): String {
    return html {
        table {
            tr(color = getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for ((index, product) in products.withIndex()) {
                tr {
                    td(color = getCellColor(index, 0)) {
                        text(product.description)
                    }
                    td(color = getCellColor(index, 1)) {
                        text(product.price)
                    }
                    td(color = getCellColor(index, 2)) {
                        text(product.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"

package aulas.kotlin.padroesprojeto

//Detalhamento da tarefa:
//
//Capture o nome do cliente.
//Solicite ao usuário a quantidade de produtos que deseja adicionar ao pedido.
//Para cada produto, capture o nome, preço e quantidade.
//Capture o endereço de entrega.
//Calcule o total do pedido somando o preço de cada produto multiplicado pela quantidade.
//Imprima os detalhes do pedido, incluindo os produtos, seus preços, quantidades, total a pagar e endereço de entrega.

class Product(val name: String, val price: Double, val quantity: Int)

class CustomOrder private constructor(
    val customerName: String,
    val products: List<Product>,
    val total: Double,
    val deliveryAddress: String
) {
    /** Classe interna para "linkar" o Bulder com a classe CustomOrder **/
    class Builder {
        private var customerName: String = ""
        private var products: MutableList<Product> = mutableListOf()
        private var deliveryAddress: String = ""

        fun setCustomerName(name: String) = apply { customerName = name }
        fun addProduct(product: Product) = apply { products.add(product) }
        fun setDeliveryAddress(address: String) = apply { deliveryAddress = address }

        fun build(): CustomOrder {
            val total = products.sumOf {it.price * it.quantity}
            return CustomOrder (customerName, products, total, deliveryAddress)
        }
    }

    fun printReceipt() {
        println("${this.customerName}")
        this.products.forEachIndexed { index, product ->
            println("${index + 1}. ${product.name} | ${product.price} | ${product.quantity}")
        }
        println("Total: ${this.total}")
        println("End: ${this.deliveryAddress}")
    }
}

fun main() {
    val customerName = readLine() ?: ""

    val orderBuilder = CustomOrder.Builder().setCustomerName(customerName)

    val numProducts = readLine()?.toIntOrNull() ?: 0
    for (i in 1..numProducts) {
        val productName = readLine() ?: ""
        val productPrice = readLine()?.toDoubleOrNull() ?: 0.0
        val productQuantity = readLine()?.toIntOrNull() ?: 0

        orderBuilder.addProduct(Product(productName, productPrice, productQuantity))
    }

    val deliveryAddress = readLine() ?: ""

    val customOrder = orderBuilder.setDeliveryAddress(deliveryAddress).build()

    customOrder.printReceipt()
}
package aulas.kotlin.exemplosdocumentacao.introducao


class Customer

class Contact(val id: Int, var email: String)

fun main() {

    val customer = Customer()

    val contact = Contact(1, "teste@gmail.com")

    println(contact.email)
    println(contact.id)

    contact.email = "jane@gmail.com"

    println(contact.email)
}
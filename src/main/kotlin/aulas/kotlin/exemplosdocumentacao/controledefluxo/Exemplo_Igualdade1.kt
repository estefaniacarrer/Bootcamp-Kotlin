package aulas.kotlin.exemplosdocumentacao.controledefluxo

fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) //  verifica a igualdade estrutural entre dois objetos.
    println(authors === writers) // verifica se dois objetos referenciam o mesmo local na memória
}

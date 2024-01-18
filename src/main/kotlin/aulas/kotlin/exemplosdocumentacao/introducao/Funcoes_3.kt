package aulas.kotlin.exemplosdocumentacao.introducao

fun main() {
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola")

    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for(m in messages) println(prefix + m)
    }

    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola",
        prefix = "Greeting: "
    )

    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("Hello", "Hallo", "Salut", "Hola")
}
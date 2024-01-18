package aulas.kotlin.exemplosdocumentacao.introducao

fun printMessage(message: String): Unit{
    println(message)
}

fun printMessaWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int):Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main(){
    printMessage("Hello")
    printMessaWithPrefix("Hello", "Log")
    printMessaWithPrefix("Hello")
    printMessaWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}
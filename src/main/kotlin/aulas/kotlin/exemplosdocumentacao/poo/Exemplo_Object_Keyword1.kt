package aulas.kotlin.exemplosdocumentacao.poo

import java.util.*

class LuckDispatcher {
    fun getNumber(){
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()
}
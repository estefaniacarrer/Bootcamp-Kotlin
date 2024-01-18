package aulas.kotlin.exemplosdocumentacao.controledefluxo

fun eatACake() = println("Eat a Cake")
fun bakeAcake() = println("Bake a Cake")

fun main() {
    var cakesEaten = 0
    var cakesBaked = 0

    while(cakesEaten < 5){
        eatACake()
        cakesEaten++
    }

    do{
        bakeAcake()
        cakesBaked++
    }while (cakesBaked < cakesEaten)
}


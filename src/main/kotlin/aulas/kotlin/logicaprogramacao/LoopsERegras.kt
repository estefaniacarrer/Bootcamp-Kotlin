package aulas.kotlin.logicaprogramacao

//Os algarismos romanos são representados por sete símbolos diferentes: I, V, X, L, C, D e M.
// Cada um com seu respectivo valor:
//
//I : 1
//V : 5
//X : 10
//L : 50
//C : 100
//D : 500
//M : 1000
//
//Eles são geralmente escritos do maior para o menor.
// Porém, para escrevermos “4” não usamos “IIII”, mas sim “IV” porque 5 - 1 = 4.

fun main() {
    val numeroRomano: String? = readLine()

    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var resultado : Int = 0
    //var atual : Int
    //var proximo : Int

    for (i in numeroRomano!!.indices) {
        val atual = numerosRomanos.getValue(numeroRomano[i])
        val proximo = when (i + 1) {
            numeroRomano.length -> 0
            else -> numerosRomanos.getValue(numeroRomano[i + 1])
        }

        resultado += (if(proximo > atual) -1 else 1) * atual
    }

    print(resultado)
}
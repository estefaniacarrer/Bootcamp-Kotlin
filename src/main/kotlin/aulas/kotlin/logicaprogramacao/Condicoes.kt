package aulas.kotlin.logicaprogramacao


//Faça um programa que receba a média de um aluno e imprima o seguinte:
//
//Caso a média seja < 5 imprima "REP";
//Caso a média seja >= 5 e < 7 imprima "REC";
//Caso a média seja >7 imprima "APR".

fun main() {
    val media = readLine()!!.toDouble();

    when(media) {
        in 0.0..4.9 -> println("REP")
        in 5.0..6.9-> println("REC")
        else -> println("APR")
    }
}
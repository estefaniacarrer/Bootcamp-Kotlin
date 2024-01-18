package aulas.kotlin.exemplosdocumentacao.introducao

import org.jetbrains.annotations.NotNull

fun main() {

    var neverNull: String = "This can't be null"
    //neverNull = null

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
    //inferredNonNull = null


    fun strLength(str: String?): Int {
        return str?.length ?:0
    }

    println(strLength(neverNull))
    println(strLength(nullable))


}
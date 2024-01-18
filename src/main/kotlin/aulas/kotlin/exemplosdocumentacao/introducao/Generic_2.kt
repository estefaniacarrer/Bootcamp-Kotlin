package aulas.kotlin.exemplosdocumentacao.introducao

class MutableStack2<E>(vararg items: E){

    private val elements =  items.toMutableList()

    fun push(element: E) = elements.add(element) // Adiciona um elemento à pilha

    fun peek(): E = elements.last() //Retorna o elemento no topo da pilha sem removê-lo

    fun pop(): E = elements.removeAt(elements.size -1) //Remove e retorna o elemento no topo da pilha

    fun isEmpty() = elements.size //Retorna true se a pilha estiver vazia, ou false caso contrário

    fun size() = elements.size //  Retorna o número de elementos na pilha,

    override fun toString() = "MutableStack2(${elements.joinToString()})"
    }

    fun <E> mutableStackOf(vararg elements: E) = MutableStack2(*elements)

    fun main() {
        val stack = mutableStackOf(0.62, 3.14, 2.7)
        print(stack)
}
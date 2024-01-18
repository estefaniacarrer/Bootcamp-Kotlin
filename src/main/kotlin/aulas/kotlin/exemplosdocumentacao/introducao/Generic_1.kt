package aulas.kotlin.exemplosdocumentacao.introducao

class MutableStack<E>(vararg items: E){

    private val elements =  items.toMutableList()

    fun push(element: E) = elements.add(element) // Adiciona um elemento à pilha

    fun peek(): E = elements.last() //Retorna o elemento no topo da pilha sem removê-lo

    fun pop(): E = elements.removeAt(elements.size -1) //Remove e retorna o elemento no topo da pilha

    fun isEmpty() = elements.size //Retorna true se a pilha estiver vazia, ou false caso contrário

    fun size() = elements.size //  Retorna o número de elementos na pilha,

    override fun toString() = "MutableStack(${elements.joinToString()})"
    }

    fun main() {
        val stack = MutableStack("A", "B", "C" )
        stack.push("D")
        println(stack)

        println("peek(): ${stack.peek()}")
        println(stack)

        for (i in 1..stack.size()){
            println("pop(): ${stack.pop()}")
            println(stack)
        }

}
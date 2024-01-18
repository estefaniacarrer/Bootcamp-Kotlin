package aulas.kotlin.padroesprojeto

//Especificações do Desafio:
//
//Crie uma classe User com os seguintes atributos: id (inteiro) e name (string).
//Implemente uma classe UserManager que siga o padrão Singleton. Esta classe deve possuir as seguintes funcionalidades:
//a. Adicionar um novo usuário ao sistema, recebendo o nome como entrada.
//b. Listar todos os usuários cadastrados.
//No programa principal (main), siga as etapas abaixo:
//a. Solicite ao usuário a quantidade de usuários que deseja cadastrar.
//b. Peça ao usuário para informar os nomes dos usuários, um por linha.
//c. Após receber os nomes e cadastrar os usuários, liste os usuários cadastrados.

class User(val id: Int, val name: String)


object UserManager {

    private val users = mutableListOf<User>()

    fun addUser(name: String) {
        val newUser = User(users.size + 1, name)
        users.add(newUser)
    }

    fun listUsers() {
        for (user in users){
            println("${user.id} - ${user.name}")
        }
    }
}

fun main() {
    val quantity = readLine()?.toIntOrNull() ?: 0

    for (i in 1..quantity) {
        val name = readLine() ?: ""
        UserManager.addUser(name)
    }

    UserManager.listUsers()
}
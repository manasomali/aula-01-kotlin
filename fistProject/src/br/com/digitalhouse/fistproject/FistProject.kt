package br.com.digitalhouse.fistproject

fun main() {
    println("Olá mundo!")
    println(mostrarNome("Matheus","Nascimento"))
    println(calculaIdade(1996))

    println("--------------------")
    for (aluno in alunosAndroid()) {
        println(aluno)
    }
}
fun mostrarNome(nome:String,sobrenome:String): String {
    return "$nome $sobrenome"
}
fun calculaIdade(ano:Int): String {
    val idade=2020-ano
    return ("$idade anos")
}
fun alunosAndroid(): ArrayList<String> {
    val listaAlunos = arrayListOf<String>()
    listaAlunos.add("Matheus")
    listaAlunos.add("Fulano")
    listaAlunos.add("Ciclano")
    listaAlunos.add("Deltrano")
    listaAlunos.remove("Ciclano")

    return listaAlunos
}

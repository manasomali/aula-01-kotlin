package exercicios01

fun main () {
    println(maiorDeTres(1,2,3))
    println(comparaTextos("teste","teste"))
    println(verificaParidade(3))
    cemPrimeirosImpares()
    println(comparaQuatroNumeros(1,2,3,4))
    cemPrimeirosNumerosPositivos()
}
fun maiorDeTres (numA:Int,numB:Int,numC:Int) :Int {
    var maior=0
    if(numA>numB) {
        if(numA>numC) {
            maior = numA
        }else{
            maior = numC
        }
    }else{
        if(numB>numC) {
            maior = numB
        }else{
            maior = numC
        }
    }
    return maior
}
fun comparaTextos (textoA:String,textoB:String) :Boolean {
    return textoA!=textoB
}
fun verificaParidade (num:Int) :Boolean {
    return num % 2 == 0
}
fun cemPrimeirosImpares () {
    for (cont in 1..100)
        if(cont % 2 != 0)
            println(cont)
}
fun comparaQuatroNumeros (numA:Int,numB:Int,numC:Int,numD:Int) :Boolean {
    return ((numA>numC) && (numA>numD))||((numB>numC) && (numB>numD))
}
fun cemPrimeirosNumerosPositivos () {
    for (cont in 1..100)
        println(cont)
}
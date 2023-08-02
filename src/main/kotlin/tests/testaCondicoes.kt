package main.kotlin.tests

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Sua conta está no positivo")
    } else if (saldo == 0.0) {
        println("Sua conta está zerada")
    } else {
        println("Sua conta está no negativo")
    }

    /*
    when{
        saldo > 0.0 -> println("Sua conta está no positivo")
        saldo == 0.0 -> println("Sua conta está zerada")
        else -> println("Sua conta está no negativo")
    }
     */
}
package main.kotlin.br.com.alura.bytebank.tests.alias

import main.kotlin.br.com.alura.bytebank.tests.testaFuncionario

fun testaAny() {
    fun testaAny(obj: Any) {
        println(obj)
    }

    testaAny("teste")

    testaAny(1)

    testaAny(1.5)

    val objAny: Any

    testaFuncionario()
}
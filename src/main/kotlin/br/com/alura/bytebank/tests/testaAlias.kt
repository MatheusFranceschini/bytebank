//Usar os seguites imports

//import main.kotlin.models.Cliente as ClientePadrao
//import main.kotlin.br.com.alura.bytebank.tests.alias.Cliente as ClienteAlias
//import java.lang.String as JavaString


package main.kotlin.br.com.alura.bytebank.tests

import main.kotlin.br.com.alura.bytebank.models.Cliente

fun testaAlias() {
    val stringKotlin: String = "Kotlin"

    //Sem o alias
    val stringJavaSemAlias: java.lang.String = java.lang.String("Java (Sem alias)")

    //com o alias
    val stringJavaComAlias: java.lang.String = java.lang.String("Java (Com alias)")

    println(stringKotlin)
    println(stringJavaSemAlias)
    println(stringJavaComAlias)

    val clientePadrao = Cliente(
        nome = "Matheus",
        cpf = "111.111.111-11",
        senha = "teste"
    )

    val clienteAlias = main.kotlin.br.com.alura.bytebank.tests.alias.Cliente(nome = "Carlos")

    println()

    println(clientePadrao.nome)
    println(clienteAlias.nome)
}
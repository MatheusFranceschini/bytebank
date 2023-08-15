package main.kotlin.br.com.alura.bytebank.tests

import main.kotlin.br.com.alura.bytebank.exceptions.SaldoInsuficienteException
import main.kotlin.br.com.alura.bytebank.models.Cliente
import main.kotlin.br.com.alura.bytebank.models.ContaCorrente
import main.kotlin.br.com.alura.bytebank.models.ContaPoupanca

fun testaComportamentosConta() {

    val matheus = Cliente(
        nome = "Matheus",
        cpf = "",
        senha = "senha"
    )

    var contaMatheus = ContaCorrente(titular = matheus, agencia = 100, conta = 1000)
    contaMatheus.depositar(500.0)

    val alice = Cliente(
        nome = "Alice",
        cpf = "",
        senha = "senha"
    )

    var contaAlice = ContaPoupanca(titular = alice, agencia = 200, conta = 2000)
    contaAlice.depositar(500.0)

    println(
        """
        Número da agência: ${contaMatheus.agencia} | Conta: ${contaMatheus.conta}
        Titular: ${contaMatheus.titular.nome}
        -----------------------------------
        Saldo: ${contaMatheus.saldo}
    """.trimIndent()
    )

    println()

    println(
        """
        Número da agência: ${contaAlice.agencia} | Conta: ${contaAlice.conta}
        Titular: ${contaAlice.titular.nome}
        -----------------------------------
        Saldo: ${contaAlice.saldo}
    """.trimIndent()
    )

    println()
    println()

//    println()
//    contaAlice.sacar(200.0)

    println("-------")
    println("Saldo do Matheus: ${contaMatheus.saldo}")
    println("Saldo da Alice: ${contaAlice.saldo}")
    println("-------")
    println()

    try{
        contaAlice.transferir(valor = 550.0, contaDestino = contaMatheus)
        println("Transferência bem sucedida")
    }catch(e: SaldoInsuficienteException){
        println("Falha na transferência")
        e.printStackTrace()
    }

    println()
    println("-------")
    println("Saldo do Matheus: ${contaMatheus.saldo}")
    println("Saldo da Alice: ${contaAlice.saldo}")
    println("-------")
    println()



//    if (contaAlice.transferir(50.0, contaMatheus)) {
//        println("Transferência feita com sucesso para a conta de destino!")
//        println("Seu novo saldo: ${contaAlice.saldo}")
//        println("Novo saldo do Matheus: ${contaMatheus.saldo}")
//    } else {
//        println("Erro ao fazer transferência!")
//    }

//    println()
//
//    println("------TITULAR------")
//    println("Titular da conta: ${matheus.nome}")
}
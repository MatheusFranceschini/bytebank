package main.kotlin.br.com.alura.bytebank.tests

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
    contaMatheus.depositar(100.0)

    val alice = Cliente(
        nome = "Alice",
        cpf = "",
        senha = "senha"
    )

    var contaAlice = ContaPoupanca(titular = alice, agencia = 200, conta = 2000)
    contaAlice.depositar(200.0)

    println(
        """
        Número da agência: ${contaMatheus.agencia} | main.kotlin.models.Conta: ${contaMatheus.conta}
        Titular: ${contaMatheus.titular}
        -----------------------------------
        Saldo: ${contaMatheus.saldo}
    """
    )

    println()

    println(
        """
        Número da agência: ${contaAlice.agencia} | main.kotlin.models.Conta: ${contaAlice.conta}
        Titular: ${contaAlice.titular}
        -----------------------------------
        Saldo: ${contaAlice.saldo}
    """
    )

    println()
    contaMatheus.depositar(200.0)
    println()
    contaMatheus.sacar(200.0)
    println()
    contaMatheus.sacar(200.0)
    println()
    if (contaAlice.transferir(50.0, contaMatheus)) {
        println("Transferência feita com sucesso para a conta de destino!")
        println("Seu novo saldo: ${contaAlice.saldo}")
        println("Novo saldo do Matheus: ${contaMatheus.saldo}")
    } else {
        println("Erro ao fazer transferência!")
    }

    println()

    println("------TITULAR------")
    println("Titular da conta: ${matheus.nome}")
}
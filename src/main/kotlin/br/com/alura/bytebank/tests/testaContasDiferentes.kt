package main.kotlin.br.com.alura.bytebank.tests

import main.kotlin.br.com.alura.bytebank.models.Cliente
import main.kotlin.br.com.alura.bytebank.models.ContaCorrente
import main.kotlin.br.com.alura.bytebank.models.ContaPoupanca
import main.kotlin.br.com.alura.bytebank.models.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Matheus",
            cpf = "111.111.111-11",
            senha = "senha",
            endereco = Endereco(
                logradouro = "Rua Viçosa do Ceará",
                numero = 44,
                complemento = "Apto 13"
            )
        ),
        agencia = 1000,
        conta = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Alice",
            cpf = "222.222.222.222-22",
            senha = "senha"
        ),
        agencia = 2000,
        conta = 2000
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println()

    contaCorrente.sacar(200.0)
    contaPoupanca.sacar(200.0)

    println()

    contaCorrente.transferir(200.0, contaPoupanca)
    println("Saldo na conta corrente: ${contaCorrente.saldo}")

    println()

    println("----TITULAR----")
    println("Titular da conta: ${contaCorrente.titular.nome}")
    println("CPF: ${contaCorrente.titular.cpf}")
    println("Agencia: ${contaCorrente.agencia}")
    println("Conta: ${contaCorrente.conta}")
    println(
        "Endereço: ${contaCorrente.titular.endereco.logradouro}, ${contaCorrente.titular.endereco.numero}, " +
                "${contaCorrente.titular.endereco.complemento}"
    )
}

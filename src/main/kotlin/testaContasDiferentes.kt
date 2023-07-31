fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Matheus",
        agencia = 1000,
        conta = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Marina",
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
}

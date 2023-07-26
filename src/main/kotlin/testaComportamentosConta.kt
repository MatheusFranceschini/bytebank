fun testaComportamentosConta() {
    var contaMatheus = Conta(titular = "Matheus", agencia = 100, conta = 1000)
    contaMatheus.depositar(100.0)

    var contaAlice = Conta("Alice", 200, 2000)
    contaAlice.depositar(200.0)

    println(
        """
        Número da agência: ${contaMatheus.agencia} | Conta: ${contaMatheus.conta}
        Titular: ${contaMatheus.titular}
        -----------------------------------
        Saldo: ${contaMatheus.saldo}
    """
    )

    println()

    println(
        """
        Número da agência: ${contaAlice.agencia} | Conta: ${contaAlice.conta}
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
}
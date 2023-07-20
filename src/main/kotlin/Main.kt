fun main() {

    /*
    val = imutável
    var = mutável
     */

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


//    testaLacos()
//    testaCondicoes(saldo)
}

class Conta(var titular: String, val agencia: Int, val conta: Int) {
    var saldo: Double = 0.0
        private set

//    constructor(titular: String, agencia: Int, conta: Int){
//        this.titular = titular
//        this.agencia = agencia
//        this.conta = conta
//    }

    fun depositar(valor: Double) {
        println("--------DEPOSITO--------")
        if (valor > 0) {
            this.saldo += valor
        }
        println("$valor adicionado na conta: ${this.titular}")
        println("Novo saldo: ${this.saldo}")
    }

    fun sacar(valor: Double) {
        println("--------SAQUE--------")
        if (this.saldo >= valor) {
            saldo -= valor
            println("Saque feito! Novo saldo: ${this.saldo}")
        } else {
            println("Saldo insuficiente. Saldo atual: ${this.saldo}")
        }
    }

    fun transferir(valor: Double, contaDestino: Conta): Boolean {
        println("--------TRANSFERÊNCIA--------")
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.depositar(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            saldo = valor
//        }
//    }
}

//fun testaLacos(){
//    var i = 1
//    while(i <= 5){
//        var titular = "$i º titular"
//        var saldo = i * 100
//        var numeroConta = i * 1000
//        var agencia = i * 10
//
//        println("""
//        Número da agência: $agencia | Conta: $numeroConta
//        Titular: $titular
//        -----------------------------------
//        Saldo: $saldo
//        """)
//
//        i++
//    }
//}
//
//fun testaCondicoes(saldo: Double) {
//    if (saldo > 0.0) {
//        println("Sua conta está no positivo")
//    } else if (saldo == 0.0) {
//        println("Sua conta está zerada")
//    } else {
//        println("Sua conta está no negativo")
//    }
//
//    /*
//    when{
//        saldo > 0.0 -> println("Sua conta está no positivo")
//        saldo == 0.0 -> println("Sua conta está zerada")
//        else -> println("Sua conta está no negativo")
//    }
//     */
//}
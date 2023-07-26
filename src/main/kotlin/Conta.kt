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
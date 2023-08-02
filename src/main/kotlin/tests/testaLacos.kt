package main.kotlin.tests

fun testaLacos() {
    var i = 1
    while (i <= 5) {
        var titular = "$i º titular"
        var saldo = i * 100
        var numeroConta = i * 1000
        var agencia = i * 10

        println(
            """
        Número da agência: $agencia | main.kotlin.models.Conta: $numeroConta
        Titular: $titular
        -----------------------------------
        Saldo: $saldo
        """
        )

        i++
    }
}

package main.kotlin.br.com.alura.bytebank.tests

fun testaExpressao() {
    val valor: String = "1.5"

    var valorRecebido: Double? = try {
        valor.toDouble()
    } catch (e: NumberFormatException) {
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("Valor recebido: $valorComTaxa")
    } else {
        println("Valor inválido")
    }
}
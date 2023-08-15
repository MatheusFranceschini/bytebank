import main.kotlin.br.com.alura.bytebank.exceptions.SaldoInsuficienteException
import main.kotlin.br.com.alura.bytebank.models.Endereco
import main.kotlin.br.com.alura.bytebank.tests.testaComportamentosConta

fun main() {
    testaComportamentosConta()
}

fun funcao1() {
    println("Início da função 1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        e.printStackTrace()
        println("Class Cast Exception")
    }

    println("Fim da função 1")
}

fun funcao2() {
    println("Início da função 2")
    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("Fim da função 2")
}
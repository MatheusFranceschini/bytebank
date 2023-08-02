package main.kotlin.br.com.alura.bytebank.models

open class Analista(
    nome: String,
    cpf: String,
    salario: Double,
    val bonus: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override fun bonificacao(): Double {
        return salario * 0.1 + bonus
    }
}

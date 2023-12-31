package main.kotlin.br.com.alura.bytebank.models

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    fun autenticar(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        } else {
            return false
        }
    }
}
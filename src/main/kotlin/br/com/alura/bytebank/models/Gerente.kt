package main.kotlin.br.com.alura.bytebank.models

import main.kotlin.br.com.alura.bytebank.interfaces.Autenticavel
import kotlin.math.round

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

    override fun bonificacao(): Double {
        return round(salario/3)
    }
}
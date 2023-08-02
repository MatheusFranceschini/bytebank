package main.kotlin.br.com.alura.bytebank.models

import main.kotlin.br.com.alura.bytebank.interfaces.Autenticavel
import kotlin.math.round

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

    override fun bonificacao(): Double {
        return plr + round(salario/3)
    }
}
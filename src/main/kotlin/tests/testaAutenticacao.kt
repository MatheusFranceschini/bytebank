package main.kotlin.tests

import main.kotlin.models.Cliente
import main.kotlin.models.Diretor
import main.kotlin.models.Gerente
import main.kotlin.models.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Matheus",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = "senha"
    )

    val diretor = Diretor(
        nome = "Marcio",
        cpf = "222.222.222-22",
        salario = 2000.0,
        plr = 200.0,
        senha = "senha"
    )

    val cliente = Cliente(
        nome = "Sergio",
        cpf = "333.333.333-33",
        senha = "senha"
    )

    val sistema = SistemaInterno()

    sistema.entrar(gerente, "senha")
    sistema.entrar(diretor, "SENHA")
    sistema.entrar(cliente, "senha")
}
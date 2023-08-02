package main.kotlin.tests

import main.kotlin.models.Analista
import main.kotlin.models.CalculaBonificacao
import main.kotlin.models.Diretor
import main.kotlin.models.Gerente

fun testaFuncionario() {
    var msg: String = ""

    val funcionarioMatheus = Analista(
        nome = "Matheus",
        cpf = "415.372.328-27",
        salario = 1000.0,
        bonus = 150.0
    )

    val gerenteMauricio = Gerente(
        nome = "Maurício",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = "gerente"
    )

    val diretorCamila = Diretor(
        nome = "Camila",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = "diretor",
        plr = 200.0
    )

    val analistaMarina = Analista(
        nome = "Marina",
        cpf = "444.444.444-44",
        salario = 2600.0,
        bonus = 250.0
    )

    println(
        """
       Nome do funcionário: ${funcionarioMatheus.nome} | CPF: ${funcionarioMatheus.cpf}
       -----------------------------------------------------
       Salário: ${funcionarioMatheus.salario}
       
       Bonificação: ${funcionarioMatheus.bonificacao()}
    """
    )

    if (gerenteMauricio.autenticar("gerente")) {
        msg = "Sim"
    } else {
        msg = "Não"
    }

    println(
        """
       Nome do gerente: ${gerenteMauricio.nome} | CPF: ${gerenteMauricio.cpf}
       -----------------------------------------------------
       Salário: ${gerenteMauricio.salario}
       
       Bonificação: ${gerenteMauricio.bonificacao()}
       
       main.kotlin.models.Gerente autenticado? $msg
    """
    )

    if (diretorCamila.autenticar("diretora")) {
        msg = "Sim"
    } else {
        msg = "Não"
    }

    println(
        """
       Nome do diretor: ${diretorCamila.nome} | CPF: ${diretorCamila.cpf}
       -----------------------------------------------------
       Salário: ${diretorCamila.salario}
       
       PLR: ${diretorCamila.plr}
       
       Bonificação: ${diretorCamila.bonificacao()}
       
       main.kotlin.models.Gerente autenticado? $msg
    """
    )

    println(
        """
       Nome do analista: ${analistaMarina.nome} | CPF: ${analistaMarina.cpf}
       -----------------------------------------------------
       Salário: ${analistaMarina.salario}
       
       Bonificação: ${analistaMarina.bonificacao()}
    """
    )

    val calculadora = CalculaBonificacao()
    calculadora.calcular(funcionarioMatheus)
    calculadora.calcular(gerenteMauricio)
    calculadora.calcular(diretorCamila)
    calculadora.calcular(analistaMarina)

    println("\nTotal de bonificação: ${calculadora.total}")
}
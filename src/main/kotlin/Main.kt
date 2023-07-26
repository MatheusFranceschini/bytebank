fun main() {

    var msg: String = ""

    val funcionarioMatheus = Funcionario(
        nome = "Matheus",
        cpf = "415.372.328-27",
        salario = 1000.0,
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

    println(
        """
       Nome do funcionário: ${funcionarioMatheus.nome} | CPF: ${funcionarioMatheus.cpf}
       -----------------------------------------------------
       Salário: ${funcionarioMatheus.salario}
       
       Salário com bonificação: ${funcionarioMatheus.bonificacao()}
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
       
       Salário com bonificação: ${gerenteMauricio.bonificacao()}
       
       Gerente autenticado? $msg
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
       
       Salário com bonificação: ${diretorCamila.bonificacao()}
       
       Gerente autenticado? $msg
    """
    )
}



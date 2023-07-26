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

    override open fun bonificacao(): Double {
        return salario * 0.1 + bonus
    }
}


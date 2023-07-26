class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override fun bonificacao(): Double {
        return super.bonificacao()
    }

    fun autenticar(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        } else {
            return false
        }
    }
}
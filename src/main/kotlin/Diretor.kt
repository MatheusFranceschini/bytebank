class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override fun bonificacao(): Double {
        return super.bonificacao() + plr
    }

    fun autenticar(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        } else {
            return false
        }
    }
}
class CalculaBonificacao {

    var total: Double = 0.0

    fun calcular(funcionario: Funcionario){
        this.total += funcionario.bonificacao()
    }


//    Não precisa ter para cada tipo de funcionário pois eles são uma extensão
//    da classe Funcionario (princípio do polimorfismo).

//    fun calcular(gerente: Gerente){
//        this.total += gerente.bonificacao()
//    }
//
//    fun calcular(diretor: Diretor){
//        this.total += diretor.bonificacao()
//    }
}
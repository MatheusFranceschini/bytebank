package main.kotlin.br.com.alura.bytebank.models

class CalculaBonificacao {

    var total: Double = 0.0

    fun calcular(funcionario: Funcionario){
        this.total += funcionario.bonificacao()
    }


//    Não precisa ter para cada tipo de funcionário pois eles são uma extensão
//    da classe main.kotlin.models.Funcionario (princípio do polimorfismo).

//    fun calcular(gerente: main.kotlin.models.Gerente){
//        this.total += gerente.bonificacao()
//    }
//
//    fun calcular(diretor: main.kotlin.models.Diretor){
//        this.total += diretor.bonificacao()
//    }
}
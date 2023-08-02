package main.kotlin.models

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    //Abstrair membros obriga que todas as classes(antigas e novas) sejam obrigadas a ter a implementação própria
    abstract fun bonificacao(): Double
}


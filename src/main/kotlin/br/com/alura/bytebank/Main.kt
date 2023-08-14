import main.kotlin.br.com.alura.bytebank.models.Endereco

fun main() {
    println("Início do programa")
    funcao1()
    println("Fim do programa")
}

fun funcao1() {
    println("Início da função 1")
    try {
        10 / 0
    } catch (e: ArithmeticException) {
        print("Arithmetic Expression")
    }
    println()
    try {
        funcao2()
    } catch (e: ClassCastException) {
        println("Class Cast Exception")
    }

    println("Fim da função 1")
}

fun funcao2() {
    println("Início da função 2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        endereco as Endereco
    }
    println("Fim da função 2")
}
import main.kotlin.br.com.alura.bytebank.interfaces.Autenticavel
import main.kotlin.br.com.alura.bytebank.models.*
import main.kotlin.br.com.alura.bytebank.tests.testaContasDiferentes

fun main() {

    //Object Expressions
    //É utilizado para criar objetos anônimos, que não precisam de uma classe. Podemos utilizar herança

    val marcelo = object: Autenticavel{
        val nome: String = "Marcelo"
        val cpf: String = "111.111.111-22"
        val senha: String = "senha"

        override fun autenticar(senha: String) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entrar(marcelo, senha = "senha")
    println()

    val alex = Cliente(nome = "Alex", cpf = "", senha = "senha", endereco = Endereco())
    val maria = Cliente(nome = "Maria", cpf = "", senha = "senha", endereco = Endereco())

    val contaAlex: ContaPoupanca = ContaPoupanca(titular = alex, agencia = 1000, conta = 1000)
    val contaMaria: ContaCorrente = ContaCorrente(titular = maria, agencia = 10001, conta = 1001)

    testaContasDiferentes()

    println()
    println("Total de contas: ${Conta.total}")

}
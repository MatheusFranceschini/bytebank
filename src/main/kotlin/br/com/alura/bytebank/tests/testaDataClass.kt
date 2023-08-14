package main.kotlin.br.com.alura.bytebank.tests

//val matheus = Pessoa(nome = "Matheus", idade = 22)
//val documento = Documento(rg = "53.761.818-1", cpf = "415.372.328-27")
//val documento2  = Documento(rg = "53.761.818-1", cpf = "415.372.328-27")
//val documento3 = documento.copy(rg = "11.111.111-1", cpf = "111.111.111-11")
//
//val (rg, cpf) = documento
//println("RG: $rg")
//println("CPF: $cpf")
//println(matheus.component1())
//
//matheus.falar()
//
//println(matheus)
//println(documento)
//println(documento3)
//
//println(documento == documento2)

class Pessoa(val nome: String, val idade: Int){

    fun falar(){
        println("Falando!")
    }

    operator fun component1() = this.nome

}

data class Documento(val rg: String, val cpf: String)
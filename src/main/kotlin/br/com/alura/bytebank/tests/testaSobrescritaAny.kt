package main.kotlin.br.com.alura.bytebank.tests

import main.kotlin.br.com.alura.bytebank.models.Endereco

fun testaSobrescritaAny() {
    val endereco = Endereco(
        logradouro = "Rua Viçosa do Ceará",
        numero = 44,
        bairro = "Vila Mascote",
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        bairro = "Vila Mariana",
        cidade = "São Paulo",
        estado = "SP",
        cep = "00000-000"
    )
    val enderecoCopia = endereco


    val enderecoPosSobr = Endereco(
        logradouro = "Rua Viçosa do Ceará",
        numero = 44,
        bairro = "Vila Mascote",
        cep = "00000-000"
    )
    val enderecoNovoPosSobr = Endereco(
        logradouro = "Rua Viçosa do Ceará",
        numero = 44,
        bairro = "Vila Mascote",
        cep = "00000-001"
    )

    //Temos 3 métodos de Any

    //equals() -> Mostra se um objeto é igual a outro
    println("Equals")
    println(endereco.equals(endereco)) //Objetos diferentes
    println(endereco.equals(enderecoNovo)) //Mesmo objeto

    println()

    println("Equals após a sobrescrita")
    println(endereco.equals(enderecoPosSobr))
    println(endereco.equals(enderecoNovoPosSobr))

    println()

    //hashCode -> retorna o ID do objeto
    println("Hashcode")
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
//    println(enderecoCopia.hashCode())

    println()

    println("Hashcode após a sobrescrita")
    println(enderecoPosSobr.hashCode())
    println(enderecoNovoPosSobr.hashCode())

    //O equals e hashCode também podem ser sobreescritos. Quando um for alterado é necessário atualizar o outro também
    //por serem "dependentes" (continua na classe Endereco)

    println()

    //toString() -> retorna o endereço de memória do objeto
    //É possível sobrescrever o método toString (continua na classe Endereco)
    println("toString")
    println(endereco.toString())
    println()
    println(enderecoNovo.toString())
    println()
    println(enderecoCopia.toString())
}
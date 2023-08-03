package main.kotlin.br.com.alura.bytebank.models

class Endereco(
    //Desse jeito deixamos os campos de endereço opcionais
    val logradouro: String = "",
    val numero: Int = 0,
    val bairro: String = "",
    val cidade: String = "",
    val estado: String = "",
    val cep: String = "",
    val complemento: String = ""
) {
}
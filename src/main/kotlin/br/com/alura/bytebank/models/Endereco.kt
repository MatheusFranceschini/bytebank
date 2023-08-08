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

    override fun toString(): String {
        return """
            Endereco(
            logradouro='$logradouro', 
            numero=$numero, 
            bairro='$bairro', 
            cidade='$cidade', 
            estado='$estado', 
            cep='$cep', 
            complemento='$complemento'
            )""".trimIndent()
    }

    //Faz a validação. Se o CEP de diferentes objetos for igual, vai retornar true
//    override fun equals(other: Any?): Boolean {
//        if(other != null && other is Endereco){
//            return this.cep == other.cep
//        }
//        return false
//    }
//
//    //Quando seguimos com alteração do método equals, é importante que alteremos também o método hashCode para que
//    //eles tenham o mesmo ID (quando necessário)
//    //Para isso pegamos o hashCode da propriedade que definimos deixar os objetos iguais, nesse caso o CEP
//    override fun hashCode(): Int {
//        return cep.hashCode()
//    }

    //O Kotlin oferece já métodos automaticamente para os dois
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (logradouro != other.logradouro) return false
        if (numero != other.numero) return false
        if (bairro != other.bairro) return false
        if (cidade != other.cidade) return false
        if (estado != other.estado) return false
        if (cep != other.cep) return false
        if (complemento != other.complemento) return false

        return true
    }

    override fun hashCode(): Int {
        var result = logradouro.hashCode()
        result = 31 * result + numero
        result = 31 * result + bairro.hashCode()
        result = 31 * result + cidade.hashCode()
        result = 31 * result + estado.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + complemento.hashCode()
        return result
    }
}
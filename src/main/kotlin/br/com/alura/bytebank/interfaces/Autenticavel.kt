package main.kotlin.br.com.alura.bytebank.interfaces

interface Autenticavel {

    fun autenticar(senha: String): Boolean
}
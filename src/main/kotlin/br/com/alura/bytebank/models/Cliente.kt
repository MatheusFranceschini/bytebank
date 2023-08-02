package main.kotlin.br.com.alura.bytebank.models

import main.kotlin.br.com.alura.bytebank.interfaces.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: String
): Autenticavel {

    override fun autenticar(senha: String): Boolean{
        if(this.senha == senha){
            return true
        }else{
            return false
        }
    }
}
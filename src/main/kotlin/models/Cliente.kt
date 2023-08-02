package main.kotlin.models

import main.kotlin.interfaces.Autenticavel

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
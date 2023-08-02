package main.kotlin.models

import main.kotlin.interfaces.Autenticavel

class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: String){
        if(admin.autenticar(senha)){
            println("Autenticado")
        }else{
            println("Falha na autenticação")
        }
    }
}
package main.kotlin.br.com.alura.bytebank.models

import main.kotlin.br.com.alura.bytebank.interfaces.Autenticavel

class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: String){
        if(admin.autenticar(senha)){
            println("Autenticado")
        }else{
            println("Falha na autenticação")
        }
    }
}
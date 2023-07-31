class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: String){
        if(admin.autenticar(senha)){
            println("Autenticado")
        }else{
            println("Falha na autenticação")
        }
    }
}
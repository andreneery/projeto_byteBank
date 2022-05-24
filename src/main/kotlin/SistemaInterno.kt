class SistemaInterno {

    fun entra(gerente: FuncionarioAdmin, senha: Int){
        if (gerente.autentica(senha)){
            println("Bem vindo ao ByteBank");
        }else{
            println("Falha na autenticação")
        }
    }

}
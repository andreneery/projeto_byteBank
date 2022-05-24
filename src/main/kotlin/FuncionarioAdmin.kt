abstract class FuncionarioAdmin(
    // o abstract serve para que a classe possa ser livremente utilizada como herança, considerando as particularidades
    //de cada funcionario (diretor, gerente, analista)
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){
    fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }; return false
    }
}

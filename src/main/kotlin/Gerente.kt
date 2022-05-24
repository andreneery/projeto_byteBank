class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    // para definir herannça podemos colocar os ":"  e indicar qual classe que será herdada
    // quando há atributos com os mesmos nomes da classe "pai" o copilador irá reclamar, não sendo necessário
) :FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
){
    override val bonificacao: Double
        get() {
            // o override serve para alterar o comportamento que vem do funcionario, no caso altera os parametros da função
            //bonificacao do funcionário da classe "pai"
            return salario
        }
}
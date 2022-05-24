class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
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
            return  salario + plr
            //super representa a classe mae que está no funcionario
        }
}
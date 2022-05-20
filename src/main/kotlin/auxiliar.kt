class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double

    // para definir herannça podemos colocar os ":"  e indicar qual classe que será herdada
    // quando há atributos com os mesmos nomes da classe "pai" o copilador irá reclamar, não sendo necessário
) :Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){
    override val bonificacao: Double
        get() = salario * 0.05

}
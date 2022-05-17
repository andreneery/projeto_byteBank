class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
    // para definir herannça podemos colocar os ":"  e indicar qual classe que será herdada
    // quando há atributos com os mesmos nomes da classe "pai" o copilador irá reclamar, não sendo necessário
) :Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){
    override val bonificacao: Double
        get() {
            return super.bonificacao + salario + plr
            //super representa a classe mae que está no funcionario
        }
    fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }; return false
    }
}
abstract class Funcionario(
    // o abstract serve para que a classe possa ser livremente utilizada como herança, considerando as particularidades
    //de cada funcionario (diretor, gerente, analista)
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    abstract val bonificacao: Double
    //agora para criar um funcionário há a bonificação exclusiva - não senod permitido utilizar a bonificação de funcionario

}

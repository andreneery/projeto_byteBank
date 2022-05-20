fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111.11",
        salario = 1000.0
    )

    println("Nome ${alex.nome}");
    println("CPF: ${alex.cpf}");
    println("Salario: ${alex.salario}");
    println("Bonificação: ${alex.bonificacao} ")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println();
    println("Nome ${fran.nome}");
    println("CPF: ${fran.cpf}");
    println("Salario: ${fran.salario}");
    println("bonificação: ${fran.bonificacao}");

    if (fran.autentica(senha = 1234)) {
        println("Autenticação realizada com sucesso")
    } else {
        println("Autenticação falhou")
    }

    val andre = Diretor(
        nome = "Andre",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4321,
        plr = 200.0
    )

    println();
    println("Nome ${andre.nome}");
    println("CPF: ${andre.cpf}");
    println("Salario: ${andre.salario}");
    println("bonificação: ${andre.bonificacao}");
    println("PLR: ${andre.plr}");

    if (andre.autentica(senha = 4321)) {
        println("Autenticação realizada com sucesso")
    } else {
        println("Autenticação falhou")
    }

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444.44",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex);
    calculadora.registra(fran);
    calculadora.registra(andre);
    calculadora.registra(maria);
    println("total de bonificação: ${calculadora.total}")
}

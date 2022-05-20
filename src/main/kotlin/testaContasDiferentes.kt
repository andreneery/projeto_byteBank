fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupança = ContaPoupança(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupança.deposita(1000.0)

    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contaPoupança.saldo}")

    contaCorrente.saca(valor = 100.0)
    contaPoupança.saca(valor = 100.0)

    println("Saldo após saque conta corrente: ${contaCorrente.saldo}")
    println("Saldo após saque conta poupança: ${contaPoupança.saldo}")

    // realizando tranferencia de conta corrente para poupança
    contaCorrente.transfere(101.0, contaPoupança);

    println("saldo conta corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após transferencia da conta corrente: ${contaPoupança.saldo}")

    //tranferencia entre poupança e corrente
    contaPoupança.transfere(55.0, contaCorrente);

    println("saldo conta poupança após transferir para corrente: ${contaPoupança.saldo}")
    println("saldo corrente após transferencia da conta poupança: ${contaCorrente.saldo}")
}

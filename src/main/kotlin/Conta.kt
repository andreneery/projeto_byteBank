abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
    protected set
    //protected faz com o valor do saldo nao seja modificado em outros arquivos, mas permite que as classes "filhas"
    // a utilizem

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            //this serve para qualificar o objeto
            //portanto, o this significa que você está mexendo em alguma coisa do próprio objeto
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}
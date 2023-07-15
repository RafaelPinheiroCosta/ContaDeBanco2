public class Cliente {
    String nome;
    int numeroDaConta;
    float saldo;

    Cliente(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroDaConta = numeroConta;
    }

    public void depositar(float valorDepositado) {
        this.saldo = valorDepositado;
    }

    public boolean sacar(float valorQueSeraSacado) {

        if (valorQueSeraSacado < this.saldo) {
            this.saldo -= valorQueSeraSacado;
            return true;
        } else {
            System.out.println("Saldo insuficiente para fazer essa transação");
            System.out.println("Seu saldo é de " + this.saldo);
            return false;
        }
    }

    public void transferir(float valorQueSeraTransferido, Cliente cliente) {

        if (sacar(valorQueSeraTransferido)) {
            cliente.depositar(valorQueSeraTransferido);
        }
    }

    public void consultarSaldo() {
        System.out.println("O Cliente "+ this.nome+ "tem saldo de R$"+this.saldo);
    }
}

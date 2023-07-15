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
        System.out.println("Você depositou R$"+valorDepositado+"na conta");
        System.out.println("O saldo do cliente "+this.nome+" agora é de R$"+this.saldo);
    }

    public boolean sacar(float valorQueSeraSacado) {

        if (valorQueSeraSacado < this.saldo) {
            this.saldo -= valorQueSeraSacado;

            System.out.println("Você sacou R$"+valorQueSeraSacado+"da conta");
            System.out.println("O saldo do cliente "+this.nome+" agora é de R$"+this.saldo);


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

            System.out.println("Você esta transferindo R$"+valorQueSeraTransferido+"da conta do(a) cliente "
                                    +this.nome+" para o(a) cliente "+cliente.nome);
            System.out.println("O saldo do cliente "+this.nome+" agora é de R$"+this.saldo);
            System.out.println("O saldo do cliente "+cliente.nome+" agora é de R$"+cliente.saldo);
        }
    }

    public void consultarSaldo() {
        System.out.println("O Cliente "+ this.nome+ "tem saldo de R$"+this.saldo);
    }
}

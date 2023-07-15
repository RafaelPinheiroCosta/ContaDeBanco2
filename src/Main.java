public class Main {
    public static void main(String[] args) {

        System.out.println("------------------criando Clientes-------------------");
        Cliente cliente1 = new Cliente("Rafael", 01);
        Cliente cliente2 = new Cliente("Gislene", 02);
        Cliente cliente3 = new Cliente("Lara", 03);

        System.out.println("-----------------consultando Saldo------------------");

        cliente1.consultarSaldo();
        cliente2.consultarSaldo();
        cliente3.consultarSaldo();

        System.out.println("-----------------depositando valores------------------");

        cliente1.depositar(200);
        cliente2.depositar(500);

        System.out.println("-----------------consultando Saldo------------------");
        cliente1.consultarSaldo();
        cliente2.consultarSaldo();
        cliente3.consultarSaldo();


        System.out.println("-----------------transferindo valores------------------");

        cliente1.transferir(50,cliente3);

        System.out.println("-----------------consultando Saldo------------------");
        cliente1.consultarSaldo();
        cliente2.consultarSaldo();
        cliente3.consultarSaldo();

    }
}
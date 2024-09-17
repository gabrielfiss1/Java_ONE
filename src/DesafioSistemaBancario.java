import java.util.Scanner;

public class DesafioSistemaBancario {
    public static void main(String[] args) {
        double saldo = 5000.00;
        String nomeCliente = "Gabriel Fiss";
        String tipoConta = "Conta Corrente";

        System.out.println(String.format(
                "*************" +
                        "\nDados iniciais do cliente:" +
                        "\nNome: %s " +
                        "\nTipo conta: %s " +
                        "\nSaldo inicial: R$ %.4f" +
                "\n *************************"
                , nomeCliente, tipoConta, saldo)
        );
        Scanner leitura = new Scanner(System.in);
        System.out.println(" \nOPERAÇÕES \n1 - Consultar saldo" + "\n2 - Receber valor" + "\n3- Transferir valor");
        int opcao = leitura.nextInt();

        while (opcao != 4) {
            if (opcao == 1) {
                System.out.println("Seu saldo é de: " + saldo);
                System.out.println(" \nOPERAÇÕES \n1 - Consultar saldo" + "\n2 - Receber valor" + "\n3- Transferir valor");
                opcao = leitura.nextInt();
            } else if (opcao == 2) {
                System.out.println("Digite o valor a receber");
                double valor = leitura.nextDouble();
                saldo = saldo + valor;
                System.out.println("Saldo atualizado: " + saldo);
                System.out.println(" \nOPERAÇÕES \n1 - Consultar saldo" + "\n2 - Receber valor" + "\n3- Transferir valor");
                opcao = leitura.nextInt();
            } else if (opcao == 3) {
                System.out.println("Digite o valor a transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Saldo atualizado: " + saldo);
                }
                System.out.println(" \nOPERAÇÕES \n1 - Consultar saldo" + "\n2 - Receber valor" + "\n3- Transferir valor");
                opcao = leitura.nextInt();
            }
        }
        System.out.println("Finalizando aplicação");


    }
}

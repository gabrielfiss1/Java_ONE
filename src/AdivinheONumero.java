import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um numero entre 0 e 100: ");
        int valor = leitura.nextInt();
        int tentativas = 0;

        while (numeroAleatorio != valor) {
            if(numeroAleatorio < valor) {
                System.out.println("O numero é menor");
                valor = leitura.nextInt();
                tentativas++;
            } else if(numeroAleatorio > valor) {
                System.out.println("O numero é maior");
                 valor = leitura.nextInt();
                tentativas++;
            }
        }
        System.out.println(String.format("venceu, o numero é: %d, com %d tentativas ", numeroAleatorio, tentativas));

    }
}

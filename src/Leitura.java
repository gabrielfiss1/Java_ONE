import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);

        System.out.println("Qual ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga sua nota para o filme ");
        double nota = leitura.nextDouble();
        System.out.println(nota);

        if (anoDeLancamento == 2024){
            System.out.println("Filme lançamento");
        } else {
            System.out.println("Filme antigo");
        }
    }

}


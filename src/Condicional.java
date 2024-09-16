public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2024;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.4;
        String tipoPlano = "plus";

        if (anoDeLancamento == 2024) {
            System.out.println("Lançamento");
        } else if (anoDeLancamento < 2024) {
            System.out.println("Filme antigo");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}

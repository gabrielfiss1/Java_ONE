

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "Carros";
        filme1.anoDeLancamento = 2001;
        filme1.duracaoEmMinutos= 120;
        filme1.incluidoNoPlano = true;

        filme1.avalia(3.2);
        filme1.avalia(10);
        filme1.avalia(5);
        filme1.exibeFichaTecnica();
    }
}

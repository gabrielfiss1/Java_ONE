public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;
    // boolean dublagem;

    void exibeFichaTecnica() { //metodo
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        System.out.println("Avaliacao: " + somaDasAvaliacoes);
        System.out.println("Media do filme: " + calculaMediaAvaliacoes());
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double calculaMediaAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}


package br.com.alura.screenmatch.modelos;

public class Titulo { // super classe
    private String nome;
    private  int anoDeLancamento;
    private  boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private  int duracaoEmMinutos;
    // boolean dublagem;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        //if (anoDeLancamento > 2024){
        //   System.out.println("Não existe no catalogo");
        // }
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }


    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() { //metodo
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        System.out.println("Avaliacao: " + somaDasAvaliacoes);
        System.out.println("Media do filme: " + calculaMediaAvaliacoes());
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public  double calculaMediaAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }
}

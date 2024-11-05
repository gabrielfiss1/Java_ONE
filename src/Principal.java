import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Carros", 2008);
        filme1.setDuracaoEmMinutos(120);
        filme1.setIncluidoNoPlano(true);
        System.out.println("Duracao do filme: " + filme1.getDuracaoEmMinutos());

        filme1.avalia(7.2);
        filme1.avalia(10);
        filme1.avalia(8);
        filme1.exibeFichaTecnica();
        System.out.println(filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.calculaMediaAvaliacoes());

        Serie lost = new Serie("Lost", 2000);

        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(8);
        lost.setMinutosPorEpisodios(50);
        lost.avalia(2.0);
        lost.avalia(2);
        lost.exibeFichaTecnica();
        System.out.println("Duracao para maratonar: " + lost.getDuracaoEmMinutos());


        Filme filme2 = new Filme("Avatar", 2001);

        filme2.setDuracaoEmMinutos(100);

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(filme2);
        calculadoraDeTempo.inclui(filme1);
        calculadoraDeTempo.inclui(lost);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(lost);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filme3 = new Filme("Carros 2", 2011);

        filme3.setDuracaoEmMinutos(120);
        filme3.avalia(8);

        ArrayList<Serie> listaSeries= new ArrayList<>();
        listaSeries.add(lost);
        System.out.println(listaSeries.size());

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(filme1);
        listaFilmes.add(filme2);
        listaFilmes.add(filme3);
        System.out.println("Tamanho da lista: " + listaFilmes.size());
        System.out.println("Primeiro filme: " + listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);
    }
}

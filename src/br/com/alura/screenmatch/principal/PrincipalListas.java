package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Carros", 2008);
        filme1.avalia(9);
        Filme filme2 = new Filme("Avatar", 2001);
        Filme filme3 = new Filme("Carros 2", 2011);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> listaAssistidos = new ArrayList<>();
        listaAssistidos.add(lost);
        listaAssistidos.add(filme1);
        for (Titulo item: listaAssistidos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 3) System.out.println((filme.getClassificacao()));
        }


    }
}

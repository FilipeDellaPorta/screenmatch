package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class MainLists {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1972);
        meuFilme.avalia(9);
        Filme meuFilme2 = new Filme("Avatar", 2009);
        meuFilme2.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2004);

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(filmeDoPaulo);
        listaDeTitulos.add(meuFilme);
        listaDeTitulos.add(meuFilme2);
        listaDeTitulos.add(lost);
        for (Titulo titulo: listaDeTitulos) {
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }
}

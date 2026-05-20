package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Venom", 2020);
        meuFilme.avalia(10);

        Filme outroFilme = new Filme("Batman", 2023);
        outroFilme.avalia(7);

        Filme filmeVictor = new Filme("Homem aranha", 2020);
        filmeVictor.avalia(6);

        Serie serie = new Serie("Vikings", 2012);

        ArrayList<Titulo> lista =  new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeVictor);
        lista.add(serie);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassficacao() > 2){
                System.out.println("Classificação "+ filme.getClassficacao());
            }

        }


        Filme filme1 = new Filme("Avatar", 2009);
        Filme filme2 = new Filme("Avatar", 2009);

        if (filme1 == filme2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("victor");
        buscaPorArtista.add("paulo");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("odenando por ano");
        System.out.println(lista);

    }
}

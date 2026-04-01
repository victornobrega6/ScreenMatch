import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.Recomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Venom");
        ///meuFilme.setNome("Venom");
        meuFilme.setAnoDeLancamento(2020);
        meuFilme.setDuracaoEmMinutos(190);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: "+meuFilme.getTotalDeAvalicoes());
        System.out.println(meuFilme.obterMedia());

        Serie serie = new Serie();

        serie.setNome("Vikings");
        serie.setAnoDeLancamento(2012);
        serie.exibeFichaTecnica();
        serie.setTemporadas(3);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodios(50);
        System.out.println("Duração para maratonar a serie: "+serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Batman");
        ///outroFilme.setNome("Batman");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(185);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        ///episodio.setSerie(Vikings);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        Filme filmeVictor = new Filme("Homem aranha");

        ///filmeVictor.setNome("Homem aranha");
        filmeVictor.setDuracaoEmMinutos(200);
        filmeVictor.setAnoDeLancamento(2020);
        filmeVictor.avalia(9);

        ArrayList<Filme> listaDeFilmes =  new ArrayList<>();
        listaDeFilmes.add(filmeVictor);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista "+listaDeFilmes.size());
        System.out.println("Primeiro Flme: "+listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme" + listaDeFilmes.get(0).toString());



    }
}

package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
    // Filme meuFilme = new Filme(); Deixa de ser usual em razão do constructor. O correto segue a baixo.

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
    //meuFilme.setAnoDeLancamento(1970);
    meuFilme.setDuracaoEmMinutos(180);

    meuFilme.exibeFichaTecnica();
    meuFilme.avalia(8);
    meuFilme.avalia(5);
    meuFilme.avalia(10);
        System.out.println("total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

    //Filme filme2 = new Filme(); Deixa de ser usual em razão do constructor. O correto segue a baixo. o comando do nome é apagado.
        Filme filme2 = new Filme("Meu malvado Favorito", 2020);
    //filme2.setAnoDeLancamento(2020);
    filme2.setDuracaoEmMinutos(180);
    filme2.avalia(5);
    filme2.avalia(8);
    filme2.avalia(7);

        filme2.exibeFichaTecnica();
        System.out.println("total de avaliações: " + filme2.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        //lost.setNome("Lost");
       // lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println(lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(filme2);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(lost);
        primeiro.setTotalVisualizacoes(300);

        // Filme filmeDoPaulo = new Filme(); Deixa de ser usual em razão do constructor. O correto segue a baixo.
        Filme filmeDoPaulo = new Filme("DogVille", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        //filmeDoPaulo.setNome("DogVille");
        //filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filme2);
        System.out.println(" O tamanho da lista de filmes é " + listaDeFilmes.size());
        System.out.println(" O primeiro filme da lista é o " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);


    }

}

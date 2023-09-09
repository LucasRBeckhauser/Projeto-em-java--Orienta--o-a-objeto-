import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
    Filme meuFilme = new Filme();
    meuFilme.setNome("O poderoso chefão");
    meuFilme.setAnoDeLancamento(1970);
    meuFilme.setDuracaoEmMinutos(180);

    meuFilme.exibeFichaTecnica();
    meuFilme.avalia(8);
    meuFilme.avalia(5);
    meuFilme.avalia(10);
        System.out.println("total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

    Filme filme2 = new Filme();
    filme2.setNome("Meu malvado Favorito");
    filme2.setAnoDeLancamento(2020);
    filme2.setDuracaoEmMinutos(180);
    filme2.avalia(5);
    filme2.avalia(8);
    filme2.avalia(7);

        filme2.exibeFichaTecnica();
        System.out.println("total de avaliações: " + filme2.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
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
        


    }

}

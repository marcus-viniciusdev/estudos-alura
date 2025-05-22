import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("The Matrix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(136);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " + meuFilme.pegaMedia());
        /*
            meuFilme.somaDasAvaliacoes = 10;
            meuFilme.totalDeAvaliacoes = 1;
            System.out.println(meuFilme.pegaMedia());
        */

        Serie arcane = new Serie();
        arcane.setNome("Arcane");
        arcane.setAnoDeLancamento(2021);
        arcane.exibeFichaTecnica();
        arcane.setTemporadas(2);
        arcane.setEpisodiosPorTemporada(9);
        arcane.setMinutosPorEpisodio(40);
        System.out.println("Duração para maratonar " + arcane.getNome() + ": " + arcane.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Sonic 3");
        outroFilme.setAnoDeLancamento(2024);
        outroFilme.setIncluidoNoPlano(false);
        outroFilme.setDuracaoEmMinutos(109);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(arcane);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(arcane);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoMarcus = new Filme();
        filmeDoMarcus.setNome("Star Wars IV");
        filmeDoMarcus.setDuracaoEmMinutos(121);
        filmeDoMarcus.setAnoDeLancamento(1977);
        filmeDoMarcus.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoMarcus);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
    }
}

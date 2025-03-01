import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("The Matrix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(136);

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
    }
}

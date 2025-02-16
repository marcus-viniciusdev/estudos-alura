public class FlimReviewer {
    public static void main(String[] args){
        //Filme a ser avaliado:
        String nomeDoFilme = "Homem-Aranha";

        //Notas do amigos de Filipe:
        double notaDoFilipe = 8.5;
        double notaDaMaria = 8.25;
        double notaDoJoao = 9.0;

        //Calculando a média do filme.
        double mediaDoFilme = (notaDoFilipe + notaDaMaria + notaDoJoao) / 3;

        //Convertendo a média em estrelas.
        int notaEmEstrelas = (int) mediaDoFilme / 2;

        //Exbindo a mensagem. revelando a nota do filme na opinião deles.
        String mensagem = String.format("A nota do filme: %s na opinião de Filipe, Maria e João é de %d estrelas ou %.2f.", nomeDoFilme, notaEmEstrelas, mediaDoFilme);
        System.out.println(mensagem);
    }
}

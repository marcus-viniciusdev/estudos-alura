public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    public void exibeFichaTecnica() {
        System.out.println("Música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    public double calculaMedia(){
        return avaliacao / numAvaliacoes;
    }
}

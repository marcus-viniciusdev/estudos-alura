public class Main {
    public static void main(String[] args) {
        Musica beatIt = new Musica();
        beatIt.titulo = "Beat It";
        beatIt.artista = "Micheal Jackson";
        beatIt.anoDeLancamento = 1982;

        beatIt.exibeFichaTecnica();
        beatIt.avalia(8);
        beatIt.avalia(9.5);
        beatIt.avalia(6);

        double media = beatIt.calculaMedia();
        System.out.println("Avaliação: " + media);
    }
}

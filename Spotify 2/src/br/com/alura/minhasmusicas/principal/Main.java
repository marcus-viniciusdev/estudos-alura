package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MeusPreferidos;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Beat It");
        minhaMusica.setAlbum("Thriller");
        minhaMusica.setCantor("Micheal Jackson");
        minhaMusica.setGenero("Pop");

        for (int i = 0; i < 1856; i++){
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 524; i++){
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("Hipsters Ponto Tech");
        meuPodcast.setApresentador("Paulo Silveira");
        meuPodcast.setDescricao("Um podcast sobre tecnologia e outras modinhas");

        for (int i = 0; i < 14; i++){
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 12; i++){
            meuPodcast.curtir();
        }

        System.out.println(minhaMusica.getTotalDeReproducoes());
        System.out.println(minhaMusica.getCurtidas());

        System.out.println(meuPodcast.getTotalDeReproducoes());
        System.out.println(meuPodcast.getCurtidas());

        MeusPreferidos meusPreferidos = new MeusPreferidos();
        meusPreferidos.inclui(minhaMusica);
    }
}

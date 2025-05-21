package br.com.alura.minhasmusicas.modelos;

public class MeusPreferidos {
    public void inclui(Audio audio){
        if (audio.getClassificacao() > 9) {
            System.out.println(audio.getTitulo() + " está os queridinhos do momento");
        } else {
            System.out.println(audio.getTitulo() + " é excelente para se ouvir mais tarde");
        }
    }
}

package Entidades;

import Inter.ReprodutorMusical;

public class Player implements ReprodutorMusical {

    Musica musica = new Musica();

    @Override
    public void tocar() {
        System.out.println("== Tocando a musica! ==> " + musica.getNome());
    }

    @Override
    public void pausar() {
        System.out.println("== Musica pausada!");
    }

    @Override
    public Musica selecionarMusica(String nomeDaMusica) {
        musica.setNome(nomeDaMusica);;
        System.out.println("== Selecionando musica! ==> " + musica.getNome());
        return musica;
    }
}

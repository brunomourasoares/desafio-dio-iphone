package Inter;

import Entidades.Musica;

public interface ReprodutorMusical extends Iphone {
    void tocar();
    void pausar();
    Musica selecionarMusica(String nomeDaMusica);
}

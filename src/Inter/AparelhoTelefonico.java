package Inter;

import Entidades.Ligacao;

public interface AparelhoTelefonico extends Iphone {
    Ligacao ligar(Long number);
    void atender(Ligacao ligacao);
    Ligacao iniciarCorreioVoz();
}

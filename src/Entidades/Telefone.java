package Entidades;
import Inter.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    public static final Long NUM_CORREIO_VOZ = 123L;

    Ligacao ligacao = new Ligacao();

    @Override
    public Ligacao ligar(Long number) {
        ligacao.setNumero(number);
        System.out.println("== Ligação feita ==> " + ligacao.getNumero());
        return ligacao;
    }

    @Override
    public void atender(Ligacao ligacao) {
        System.out.println("== Ligação atendida! ==> " + ligacao.getNumero());
    }

    @Override
    public Ligacao iniciarCorreioVoz() {
        ligacao.setNumero(NUM_CORREIO_VOZ);
        System.out.println("== Correio de voz iniciado ==> " + ligacao.getNumero());
        return ligacao;
    }
}
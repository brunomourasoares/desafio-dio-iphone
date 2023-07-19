import Entidades.Chrome;
import Entidades.Ligacao;
import Entidades.Player;
import Entidades.Telefone;
import Inter.AparelhoTelefonico;
import Inter.Iphone;
import Inter.NavegadorInternet;
import Inter.ReprodutorMusical;

public class App {
    public static void main(String[] args) {
        Iphone reprodutor = new Player();
        ((ReprodutorMusical) reprodutor).selecionarMusica("Unstoppable - Sia");
        ((ReprodutorMusical) reprodutor).tocar();
        ((ReprodutorMusical) reprodutor).pausar();

        System.out.println("\n ================================== \n");

        Iphone telefone = new Telefone();
        Ligacao ligar = ((AparelhoTelefonico) telefone).ligar(12345678910L);
        ((AparelhoTelefonico) telefone).atender(ligar);
        ((AparelhoTelefonico) telefone).iniciarCorreioVoz();

        System.out.println("\n ================================== \n");

        Iphone navegador = new Chrome();
        ((NavegadorInternet) navegador).exibirPagina("http://localhost/");
        ((NavegadorInternet) navegador).adicionarNovaAba();
        ((NavegadorInternet) navegador).atualizarPagina();
       
    }
}

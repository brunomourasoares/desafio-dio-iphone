package Inter;

import Entidades.Aba;
import Entidades.Pagina;

public interface NavegadorInternet extends Iphone {
    Pagina exibirPagina(String url);
    Aba adicionarNovaAba();
    void atualizarPagina();
}

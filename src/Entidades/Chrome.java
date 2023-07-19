package Entidades;
import Inter.NavegadorInternet;

public class Chrome implements NavegadorInternet {

    Pagina pagina = new Pagina();

    @Override
    public Pagina exibirPagina(String url) {
        pagina.setUrl(url);
        System.out.println("== Página exibida! ==> " + pagina.getUrl());
        return pagina;
    }

    @Override
    public Aba adicionarNovaAba() {
        Aba aba = new Aba();
        System.out.println("== Aba adicionada!");
        return aba;
    }

    @Override
    public void atualizarPagina() {
        pagina.setUrl(pagina.getUrl());
        System.out.println("== Pagina atualizada! ==> " + pagina.getUrl());
    }
}

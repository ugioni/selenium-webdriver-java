package e2e.pages;

import e2e.core.Core;
import org.openqa.selenium.By;

public class Home extends Core {

    public String getUrl() {
        return "https://www.saucedemo.com/";
    }

    public By getCampoBarraPesquisa() {
        return getById("search_query_top");
    }

    public By getBotaoBuscar() {
        return getByCss("button[type='submit']");
    }

    public By getMensagemOffline() {
        return getByCss("div[class='info-heading']");
    }

    public By getCampoLogin() {
        return getById("user-name");
    }

    public By getCampoSenha() {
        return getById("password");
    }

    public By getBotaoLogin() {
        return getById("login-button");
    }
}
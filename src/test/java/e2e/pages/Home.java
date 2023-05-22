package e2e.pages;

import e2e.core.Core;
import org.openqa.selenium.By;

public class Home extends Core {

    public String getUrl() {
        return "http://automationpractice.pl/";
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
}
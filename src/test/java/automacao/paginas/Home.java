package automacao.paginas;

import automacao.core.Core;
import org.openqa.selenium.By;

public class Home extends Core {

    public String getUrl() {
        return "http://www.automationpractice.com";
    }

    public By getCampoBarraPesquisa() {
        return getById("search_query_top");
    }

    public By getBotaoBuscar() {
        return getByCss("button[type='submit']");
    }
}
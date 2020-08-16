package automacao.paginas;

import automacao.core.Core;
import org.openqa.selenium.By;

public class Produtos extends Core {

    public By getCampoNomeProduto() {
        return getByCss("a[class='product_img_link']");
    }

    public By getQuantidadeResultados() {
        return getByCss("span[class='heading-counter']");
    }
}
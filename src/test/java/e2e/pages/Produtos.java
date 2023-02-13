package e2e.pages;

import e2e.core.Core;
import org.openqa.selenium.By;

public class Produtos extends Core {

    public By getCampoNomeProduto() {
        return getByCss("a[class='product_img_link']");
    }

    public By getQuantidadeResultados() {
        return getByCss("span[class='heading-counter']");
    }

    public By getMenuTshirt() {
        return getByLinkText("T-SHIRTS");
    }

    public By getProdutoBackpack() {
        return getByLinkText("Sauce Labs Backpack");
    }

    public By getImagemProduto() {
        return getByClassName("product_img_link");
    }

    public By getBotaoAddCarrinho() {
        return getById("add_to_cart");
    }

    public By getCampoDescCompleta() {
        return getByCss("div[class='inventory_details_desc large_size']");
    }
}
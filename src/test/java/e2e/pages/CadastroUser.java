package e2e.pages;

import e2e.core.Core;
import org.openqa.selenium.By;

public class CadastroUser extends Core {

    public String getUrl() {
        return "https://buger-eats.vercel.app/";
    }

    public By getBotaoCadastro() {
        return getByCss("a[href='/deliver']");
    }


    public By getCampoNomeProduto() {
        return getByCss("a[class='product_img_link']");
    }

    public By getBotaoAddCarrinho() {
        return getById("add_to_cart");
    }
}
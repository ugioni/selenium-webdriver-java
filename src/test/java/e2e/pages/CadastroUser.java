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


    public By getCampoNomeCompleto() {
        return getByCss("input[name='name']");
    }

    public By getCampoCPF() {
        return getByCss("input[name='cpf']");
    }

    public By getCampoEmail() {
        return getByCss("input[name='email']");
    }

    public By getCampoWhatsapp() {
        return getByCss("input[name='whatsapp']");
    }

    public By getCampoCep() {
        return getByCss("input[name='postalcode']");
    }

    public By getBotaoBuscarCep() {
        return getByCss("input[value='Buscar CEP']");
    }

    public By getCampoNumero() {
        return getByCss("input[name='address-number']");
    }

    public By getCampoComplemento() {
        return getByCss("input[name='address-details']");
    }

    public By getBotaoBicicleta() {
        return getByCss("img[alt='Bicicleta']");
    }

    public By getCampoAnexo() {
        return getByCss("input[type='file']");
    }

    public By getBotaoCadastrar() {
        return getByCss("button[type='submit']");
    }

    public By getBotaoFechar() {
        return getByCss("button[class='swal2-confirm swal2-styled']");
    }

    public By getMensagem() {
        return getByCss("div[class='swal2-html-container']");
    }
}
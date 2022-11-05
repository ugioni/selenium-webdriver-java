package e2e.pages;

import e2e.core.Core;
import org.openqa.selenium.By;

public class CreateAnAccount extends Core {

    public By getSign() {
        return getByCss("a[class='login']");
    }
    public By getEmailCriarConta() {

        return getById("email_create");
    }
    public By getBotaoCreateAnAccount() {

        return getById("SubmitCreate");

    }
    public By getBotaoRadioOne() {

        return getById("id_gender1");

    }

    public By getCampoPrimeiroNome() {

        return getById("customer_firstname");

    }
    public By getCampoUltimoNome() {

        return getById("customer_lastname");

    }
    public By getEmailOne() {

        return getById("email");

    }
    public By getPassword() {

        return getById("passwd");

    }

    public By getDayBday() {

        return getById("uniform-days");

    }
    public By getMonthyBday() {

        return getById("uniform-months");

    }

    public By getYearsBday() {

        return getById("uniform-years");

    }
    public By getPrimeiroNome() {

        return getById("firstname");

    }
    public By getUltimoNome() {

        return getById("lastname");

    }
    public By getCompany() {

        return getById("company");

    }
}

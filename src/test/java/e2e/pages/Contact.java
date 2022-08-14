package e2e.pages;

import e2e.core.Core;
import org.openqa.selenium.By;

public class Contact extends Core {

    public By getMenuContactUs() {
        return getByLinkText("Contact us");
    }

    public By getSelectContact() {
        return getById("uniform-id_contact");
    }

    public By getEmail() {
        return getById("email");
    }

    public By getOrderReference() {
        return getById("id_order");

    }

    public By getMessage() {
        return getById("message");

    }

    public By getButtonSend() {
        return getById("submitMessage");

    }

    public By getValidarFormulario() {
        return getByCss("p[class='alert alert-success']");
    }

    public By getChooseFile() {
        return getById("fileUpload");
    }
}

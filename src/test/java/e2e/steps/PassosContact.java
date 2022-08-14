package e2e.steps;

import e2e.core.Core;
import e2e.pages.Contact;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class PassosContact extends Core {

    private Contact paginaContact;

    public PassosContact() {
        paginaContact = new Contact();
        PageFactory.initElements(driver, this.paginaContact);
    }

    @Given("Clica em Contact us")
    public void clica_em_contact_us() {
        clicar(paginaContact.getMenuContactUs());
    }

    @Given("Seleciona a opcão Custumer Service")
    public void seleciona_a_opcao_custumer_service() {
        selecionarSelect(paginaContact.getSelectContact(), "id_contact", 1);
    }

    @Given("^Digitar o \"([^\"]*)\" no campo email address$")
    public void digitar_o_email_no_campo_email_address(String email) {
        digitarCampo(paginaContact.getEmail(), email);

    }

    @Given("^Digitar \"([^\"]*)\" no campo order reference$")
    public void digitar_testing_no_campo_order_reference(String orderReference) {
        digitarCampo(paginaContact.getOrderReference(), orderReference);
    }

    @Given("Anexa um arquivo no campo de file")
    public void anexa_um_arquivo_no_campo_de_file() {
        anexarArquivo(paginaContact.getChooseFile(), "testes.txt");
    }

    @Given("^Digitar \"([^\"]*)\" no campo message$")
    public void digitar_no_campo_message(String message) {
        digitarCampo(paginaContact.getMessage(), message);
    }

    @When("Clico no botão send")
    public void clico_no_botao_send() {
        clicar(paginaContact.getButtonSend());
    }

    @Then("^Deverá mostrar a \"([^\"]*)\"$")
    public void devera_mostrar_a_mensagem_de_sucesso(String messageSuccess) {
        validarCampoGetText(paginaContact.getValidarFormulario(), messageSuccess);
    }
}
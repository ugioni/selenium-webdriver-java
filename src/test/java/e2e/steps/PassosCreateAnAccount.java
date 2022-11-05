package e2e.steps;

import e2e.core.Core;
import e2e.pages.CreateAnAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static e2e.core.Core.driver;

public class PassosCreateAnAccount extends Core {

    private CreateAnAccount paginacreateanaccount;

    public  PassosCreateAnAccount() {
        paginacreateanaccount = new CreateAnAccount();
        PageFactory.initElements(driver, this.paginacreateanaccount);

    }
    @Given("clica em sign")
    public void clica_em_sign() {
        clicar(paginacreateanaccount.getSign());

    }
    @Given("^Digita o \"([^\"]*)\" no campo email address do sign$")
    public void digita_o_email_no_campo_email_address_do_sign(String email) {
        digitarCampo(paginacreateanaccount.getEmailCriarConta(), email);
    }
    @Given("^Clica no botão Create an account$")
    public void clica_no_botao_create_an_account() {
        clicar(paginacreateanaccount.getBotaoCreateAnAccount());

    }
    @Given("^Clica no radiobutton com o nome de mr$")
    public void clica_no_radio_button_com_o_nome_de_mr() {
        clicar(paginacreateanaccount.getBotaoRadioOne());
    }
    @Given("^Digita o primeiro nome \"([^\"]*)\"$")
    public void digita_o_primeiro_nome(String firstName) {
        digitarCampo(paginacreateanaccount.getCampoPrimeiroNome(), firstName);

    }
    @Given("^Digita o ultimo nome \"([^\"]*)\"$")
    public void digita_o_ultimo_nome(String lastName) {
        digitarCampo(paginacreateanaccount.getCampoUltimoNome(), lastName);
    }

    @Given("^Limpa e digita o \"([^\"]*)\" no campo email$")
    public void Digita_o_email_depois_de_limpar_campo(String email) {
        limparCampo(paginacreateanaccount.getEmailOne());
        digitarCampo(paginacreateanaccount.getEmailOne(), email);

    }
    @Given("^Digita o \"([^\"]*)\" no campo password$")
    public void digita_o_password_no_sign(String password) {
        digitarCampo(paginacreateanaccount.getPassword(), password);

    }
    @Given("^Seleciona o dia do aniversario$")
    public void seleciona_o_dia_do_aniversario() {
        //selecionaCampoSelectPorValue(paginacreateanaccount.getDayBday(),"days","28");

    }
    @Given("^Seleciona o mês do aniversario$")
    public void seleciona_o_mes_do_aniversario() {
        //selecionaCampoSelectPorValue(paginacreateanaccount.getMonthyBday(),"months","12");
    }
    @Given("^Seleciona o ano do aniversario$")
    public void seleciona_o_ano_do_aniversario() {
        //selecionaCampoSelectPorValue(paginacreateanaccount.getYearsBday(),"years","1988");

    }

    @Given("^limpa e digita o \"([^\"]*)\" no campo first name$")
    public void limpa_e_digita_o_no_campo_first_name(String firstName) {
        limparCampo(paginacreateanaccount.getPrimeiroNome());
        digitarCampo(paginacreateanaccount.getCampoPrimeiroNome(), firstName);
    }
    @Given("^limpa e digita o \"([^\"]*)\" no campo last name$")
    public void digita_o_ultimo_nome_depois_de_limpar(String lastName) {
        limparCampo(paginacreateanaccount.getUltimoNome());
        digitarCampo(paginacreateanaccount.getUltimoNome(), lastName);

    }
    @Given("Digita o nome da \"([^\"]*)\" no campo company")
    public void digita_o_nome_da_companhia_no_campo_company(String companhia) {
        digitarCampo(paginacreateanaccount.getCompany(), companhia);

    }
    @Given("Digita o \"([^\"]*)\" no campo address")
    public void digita_o_no_campo_address(String string) {

    }
    @Given("Digita o \"([^\"]*)\" no campo address line two")
    public void digita_o_no_campo_address_line_two(String string) {

    }
    @Given("Digita a \"([^\"]*)\" no campo city")
    public void digita_a_no_campo_city(String string) {

    }
    @Given("Seleciona o estado no campo state")
    public void seleciona_o_estado_no_campo_state() {

    }
    @Given("Digita o \"([^\"]*)\" no campo zip code")
    public void digita_o_no_campo_zip_code(String string) {

    }
    @Given("Selecione o pais")
    public void selecione_o_pais() {

    }
    @Given("Digita a informação adicional testing no campo information addicional")
    public void digita_a_informacao_adicional_no_campo(String string) {

    }
    @Given("Digita o \"([^\"]*)\" no campo phone home")
    public void digita_o_no_campo_phone_home(String string) {

    }
    @Given("Digita o \"([^\"]*)\" no campo mobile phone")
    public void digita_o_no_campo_mobile_phone(String string) {

    }
    @Given("Limpe o campo e digite o \"([^\"]*)\" no campo Assign an address alias for future reference")
    public void limpe_o_campo_e_digite_o_email(String string) {

    }
    @When("Clico no botão Register")
    public void clico_no_botao_register() {

    }
    @Then("mostre a mensagem de boas vindas \"([^\"]*)\"")
    public void valida_a_mensagem_de_boas_vindas(String string) {

    }

}

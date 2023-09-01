package e2e.steps;

import e2e.core.Core;
import e2e.pages.CadastroUser;
import e2e.pages.Contact;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class PassosCadastroUser extends Core {

    private CadastroUser paginaCadastroUser;

    public PassosCadastroUser() {
        paginaCadastroUser = new CadastroUser();
         PageFactory.initElements(driver, this.paginaCadastroUser);
    }

    @Given("o usuário acessou a home do cadastro para entregas")
    public void o_usuario_acessou_a_home_do_cadastro_para_entregas() {
        acessarPagina(paginaCadastroUser.getUrl());
    }
    @When("clicar no cadastre-se")
    public void clicar_no_cadastre_se() {
        clicar(paginaCadastroUser.getBotaoCadastro());
    }
    @When("preencher os dados de cadastro do usuario")
    public void preencher_os_dados_de_cadastro_do_usuario() {

    }
    @Then("deve ser exibida a mensagem de confirmação do cadastro")
    public void deve_ser_exibida_a_mensagem_de_confirmacao_do_cadastro() {

    }
}
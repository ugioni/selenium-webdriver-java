package e2e.steps;

import e2e.core.Core;
import e2e.pages.Home;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class PassosHome extends Core {

    private Home paginaHome;

    public PassosHome() {
        paginaHome = new Home();
        PageFactory.initElements(driver, this.paginaHome);
    }

    @Given("^o usuário acessou a home da loja$")
    public void o_usuário_acessou_a_home_da_loja() {
        acessarPagina(paginaHome.getUrl());
    }

    @Given("^digitar a descrição do produto \"([^\"]*)\" na barra de pesquisa$")
    public void digitar_a_descrição_do_produto_na_barra_de_pesquisa(String descProduto) {
        digitarCampo(paginaHome.getCampoBarraPesquisa(), descProduto);
    }

    @When("^clicar no botão buscar na barra de pesquisa$")
    public void clicar_no_botão_buscar_na_barra_de_pesquisa() {
        clicar(paginaHome.getBotaoBuscar());
    }

    @Then("^deve ser exibida uma mensagem da validação$")
    public void deve_ser_exibida_uma_mensagem_da_validação() {
        validarCampoGetText(paginaHome.getMensagemOffline(), "This Account has been suspended.");
    }
}
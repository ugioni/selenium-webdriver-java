package automacao.passos;

import automacao.core.Core;
import automacao.paginas.Home;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class PassosHome extends Core {

    private Home paginaHome;

    public PassosHome() {
        paginaHome = new Home();
        PageFactory.initElements(driver, this.paginaHome);
    }

    @Before(value = "@Home")
    public void before(Scenario cenario) {
        setCenario(cenario);
    }

    @Given("^o usuário acessou a home da loja$")
    public void o_usuário_acessou_a_home_da_loja() {
        acessarPagina(paginaHome.getUrl());
        aguardarThreadSleep(1);
    }

    @Given("^digitar a descrição do produto \"([^\"]*)\" na barra de pesquisa$")
    public void digitar_a_descrição_do_produto_na_barra_de_pesquisa(String descProduto) {
        digitarCampo(paginaHome.getCampoBarraPesquisa(), descProduto);
    }

    @When("^clicar no botão buscar na barra de pesquisa$")
    public void clicar_no_botão_buscar_na_barra_de_pesquisa() {
        clicar(paginaHome.getBotaoBuscar());
        aguardarThreadSleep(2);
    }
}
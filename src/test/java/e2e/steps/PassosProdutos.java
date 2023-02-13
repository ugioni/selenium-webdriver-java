package e2e.steps;

import e2e.core.Core;
import e2e.pages.Produtos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class PassosProdutos extends Core {

    private Produtos paginaProdutos;

    public PassosProdutos() {
        paginaProdutos = new Produtos();
        PageFactory.initElements(driver, this.paginaProdutos);
    }

    @Then("^deve ser exibido um resultado encontrado para a pesquisa$")
    public void deve_ser_exibido_um_resultado_encontrado_para_a_pesquisa() {
        validarCampoGetText(paginaProdutos.getQuantidadeResultados(), "1 result has been found.");
    }

    @Then("^deve ser exibido o produto \"([^\"]*)\" encontrado para a pesquisa$")
    public void deve_ser_exibido_o_produto_encontrado_para_a_pesquisa(String produto) {
        validarCampoGetAttribute(paginaProdutos.getCampoNomeProduto(), produto, "title");
    }

    @Given("clica no menu T-Shirt")
    public void clica_no_menu_t_shirt() {
        clicar(paginaProdutos.getMenuTshirt());
    }

    @When("clica no produto backpack")
    public void clica_no_produto_backpack() {
        clicar(paginaProdutos.getProdutoBackpack());
    }

    @When("clicar em Quick view do produto")
    public void clicar_em_quick_view_do_produto() {
        clicar(paginaProdutos.getImagemProduto());
    }

    @Then("a modal contendo o produto descrito deveria aparecer")
    public void a_modal_contendo_o_produto_descrito_deveria_aparecer() {
        validarCampoGetTextFrame(paginaProdutos.getBotaoAddCarrinho(), "Add to cart", 0);
    }

    @Then("deve ser exibida a descrição completa do produto")
    public void deve_ser_exibida_a_descricao_completa_do_produto() {
        validarCampoGetText(paginaProdutos.getCampoDescCompleta(), "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
    }
}
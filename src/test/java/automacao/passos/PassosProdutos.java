package automacao.passos;

import automacao.core.Core;
import automacao.paginas.Produtos;
import cucumber.api.java.en.Then;
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
}
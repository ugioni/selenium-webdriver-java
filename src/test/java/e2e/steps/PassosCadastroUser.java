package e2e.steps;

import com.github.javafaker.Faker;
import e2e.core.Core;
import e2e.pages.CadastroUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class PassosCadastroUser extends Core {

    private CadastroUser paginaCadastroUser;

    public PassosCadastroUser() {
        paginaCadastroUser = new CadastroUser();
        PageFactory.initElements(driver, this.paginaCadastroUser);
        Faker faker = new Faker();
    }

    @Given("o usuário acessou a home do cadastro para entregas")
    public void o_usuario_acessou_a_home_do_cadastro_para_entregas() {
        acessarPagina(paginaCadastroUser.getUrl());
    }

    @When("clicar no cadastre-se")
    public void clicar_no_cadastre_se() {
        clicar(paginaCadastroUser.getBotaoCadastro());
    }

    @When("preencher os dados de cadastro do usuario \"([^\"]*)\" \"([^\"]*)\"$")
    public void preencher_os_dados_de_cadastro_do_usuario(String nome, String cpf) {
        digitarCampo(paginaCadastroUser.getCampoNomeCompleto(), nome);
        digitarCampo(paginaCadastroUser.getCampoCPF(), cpf);
        digitarCampo(paginaCadastroUser.getCampoEmail(), faker.internet().emailAddress());
        digitarCampo(paginaCadastroUser.getCampoWhatsapp(), faker.phoneNumber().phoneNumber());
        digitarCampo(paginaCadastroUser.getCampoCep(), "88817070");
        clicar(paginaCadastroUser.getBotaoBuscarCep());
        digitarCampo(paginaCadastroUser.getCampoNumero(), faker.number().numberBetween(1, 125) + " ");
        digitarCampo(paginaCadastroUser.getCampoComplemento(), "casa " + faker.color().name());
        clicar(paginaCadastroUser.getBotaoBicicleta());
        anexarArquivo(paginaCadastroUser.getCampoAnexo(), "cnh_testes.jpg");
        clicar(paginaCadastroUser.getBotaoCadastrar());
    }

    @Then("deve ser exibida a mensagem de confirmação do cadastro")
    public void deve_ser_exibida_a_mensagem_de_confirmacao_do_cadastro() {
        validarCampoGetText(paginaCadastroUser.getMensagem(), "Recebemos os seus dados. Fique de olho na sua caixa de email, pois e em breve retornamos o contato.");
        clicar(paginaCadastroUser.getBotaoFechar());
    }
}
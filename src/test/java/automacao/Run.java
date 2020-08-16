package automacao;

import automacao.core.Core;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json", "html:target/cucumber-html-report",
        "json:target/cucumber-html-report.json"}, features = "src/", monochrome = true,
        tags = {"@BuscarProduto"})

public class Run extends Core {

    public Run() {
    }

    @BeforeClass
    public static void iniciar() {
        iniciarDriver();
    }

    @AfterClass
    public static void fechar() {
        fecharDriver();
    }
}
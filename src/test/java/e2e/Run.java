package e2e;

import e2e.core.Core;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json", "html:target/cucumber-html-report.html",
        "json:target/cucumber-html-report.json"}, features = "src/", monochrome = true,
        tags = "@BuscarProduto", publish = true)

public class Run extends Core {

    public static boolean HEADLESS = false;

    public Run() {
    }

    @BeforeClass
    public static void iniciar() {
        iniciarDriver(HEADLESS);
    }

    @AfterClass
    public static void fechar() {
        fecharDriver();
    }
}
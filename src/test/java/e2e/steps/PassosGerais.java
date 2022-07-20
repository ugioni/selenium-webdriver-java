package e2e.steps;

import e2e.core.Core;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class PassosGerais extends Core {

    @Before(order = 0)
    public void before(Scenario cenario) {
        setCenario(cenario);
    }

    @After()
    public void after() {
        gerarEvidencia();
    }
}
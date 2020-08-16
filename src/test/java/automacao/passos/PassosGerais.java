package automacao.passos;

import automacao.core.Core;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class PassosGerais extends Core {

    @Before(order = 0)
    public void before(Scenario cenario) {
        setCenario(cenario);
        aguardarThreadSleep(1);
    }

    @After()
    public void after() {
        gerarEvidencia();
        aguardarThreadSleep(1);
    }
}
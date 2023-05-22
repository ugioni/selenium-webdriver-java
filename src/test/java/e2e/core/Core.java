package e2e.core;

import com.github.javafaker.Faker;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Core {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static JavascriptExecutor jsExec;
    public static Faker faker;
    private Scenario cenario = null;

    public Core() {
    }

    public static void iniciarDriver(boolean headless) {
        driver = null;
        try {
            driver = getDriver(getProperties("browser"), headless);
            wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
            jsExec = (JavascriptExecutor) driver;
            faker = new Faker();
        } catch (Exception e) {
            System.out.println("Não foi possível iniciar o driver " + e.getMessage());
        }
    }

    private static WebDriver getDriver(String browser, boolean headless) throws Exception {
        if (driver == null) {
            if (browser.equals("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
                if (headless) {
                    options.addArguments("--headless");
                }
                if (System.getProperty("os.name").contains("Win")) {
                    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                } else if (System.getProperty("os.name").contains("Mac")) {
                    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac");
                } else {
                    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
                }
                driver = new ChromeDriver(options);
            }
        }
        driver.manage().window().maximize();
        return driver;
    }

    private static String getProperties(String name) throws Exception {
        Properties properties = new Properties();
        String value = null;
        try {
            properties.load(new FileInputStream("properties/browser"));
            value = properties.getProperty(name);
        } catch (IOException e) {
            System.out.println("Não foi possivel acessar o arquivo properties " + e.getMessage());
        }
        return value;
    }

    public void aguardar() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void aguardar(int segundos) {
        driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);
    }

    public void aguardarElementoPresente(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (TimeoutException e) {
            Assert.fail("O elemento " + by.toString() + " não está presente na página");
        }
    }

    public void aguardarElementoCarregar(By by) {
        WebElement elemento = getElemento(by);
        try {
            wait.until(ExpectedConditions.visibilityOf(elemento));
        } catch (TimeoutException e) {
            Assert.fail("O elemento " + elemento.toString() + " não está visível na página");
        }
    }

    public WebElement getElemento(By by) {
        aguardarElementoPresente(by);
        return driver.findElement(by);
    }

    public List<WebElement> getElementos(By by) {
        aguardarElementoPresente(by);
        return driver.findElements(by);
    }

    public By getById(String id) {
        return By.id(id);
    }

    public By getByCss(String css) {
        return By.cssSelector(css);
    }

    public By getByXpath(String xpath) {
        return By.xpath(xpath);
    }

    public By getByClassName(String className) {
        return By.className(className);
    }

    public By getByTagName(String tagName) {
        return By.tagName(tagName);
    }

    public By getByLinkText(String linkText) {
        return By.linkText(linkText);
    }

    public By getByPartialLinkText(String linkText) {
        return By.partialLinkText(linkText);
    }

    public void digitarCampo(By by, String informacao) {
        if (!informacao.trim().isEmpty()) {
            aguardarElementoCarregar(by);
            getElemento(by).sendKeys(Keys.chord(Keys.CONTROL, "a"), informacao);
        }
    }

    public void digitarSaindoCampo(By by, String informacao) {
        if (!informacao.trim().isEmpty()) {
            digitarCampo(by, informacao);
            sairCampo(by);
        }
    }

    public void limparCampo(By by) {
        aguardarElementoCarregar(by);
        getElemento(by).clear();
    }

    public void sairCampo(By by) {
        aguardarElementoCarregar(by);
        getElemento(by).sendKeys(Keys.TAB);
    }

    public void clicar(By by) {
        aguardarElementoCarregar(by);
        getElemento(by).click();
        aguardarThreadSleep(1);
    }

    public void atualizarPagina() {
        driver.navigate().refresh();
    }

    public void acessarPagina(String url) {
        driver.get(url);
        aguardarThreadSleep(1);
    }

    public String getUrlAtual() {
        String urlAtual = null;
        urlAtual = driver.getCurrentUrl();
        return urlAtual;
    }

    public static void fecharDriver() {
        driver.quit();
    }

    public void aguardarThreadSleep(int segundos) {
        long milisegundos = segundos * 1000;
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void validarCampoGetText(By by, String esperado) {
        aguardarElementoCarregar(by);
        Assert.assertEquals(esperado, getElemento(by).getText());
    }

    public void validarCampoGetAttribute(By by, String esperado, String atributo) {
        aguardarElementoCarregar(by);
        Assert.assertEquals(esperado, getElemento(by).getAttribute(atributo));
    }

    public void gerarImagemCenario(Scenario cenarioEvidencia, WebDriver driver) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        cenarioEvidencia.attach(screenshot, "image/png", "Imagem da tela");
    }

    public void gerarEvidencia() {
        gerarImagemCenario(cenario, driver);
    }

    public Scenario getCenario() {
        return cenario;
    }

    public void setCenario(Scenario cenario) {
        this.cenario = cenario;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static Faker getDados() {
        return faker;
    }

    public void irParaFrame(int index) {
        driver.switchTo().frame(index);
    }

    public void validarCampoGetTextFrame(By by, String esperado, int index) {
        irParaFrame(index);
        validarCampoGetText(by, esperado);
    }

    public void selecionarSelect(By by, String name, int index) {
        clicar(by);
        WebElement selectElement = driver.findElement(By.name(name));
        Select select = new Select(selectElement);
        select.selectByIndex(index);
    }

    public void anexarArquivo(By by, String arquivo) {
        try {
            String caminho = new File("arquivos/" + arquivo).getCanonicalPath();
            driver.findElement(by).sendKeys(caminho);
        } catch (IOException e) {
            Assert.fail("Não foi possível anexar o arquivo\nExceção lançada: ".concat(e.getMessage()));
        }
    }
}
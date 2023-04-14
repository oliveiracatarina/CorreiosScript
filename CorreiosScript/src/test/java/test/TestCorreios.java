package test;

import com.google.common.annotations.VisibleForTesting;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PaginaInicialCorreios;
import pages.PaginaResultadoCep;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

public class TestCorreios {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.correios.com.br/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testCepNaoEncontrado() {
        PaginaInicialCorreios paginaInicial = new PaginaInicialCorreios(driver);
        paginaInicial.buscarPorCEP("80700000");

        PaginaResultadoCep paginaResultado = new PaginaResultadoCep(driver);
        assertTrue(paginaResultado.mensagemEnderecoNaoEncontradoExibida());
        paginaResultado.voltarParaPaginaInicial();
    }
}

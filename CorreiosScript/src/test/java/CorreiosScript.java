import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CorreiosScript {
    WebDriver driver;

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Dado("que estou no site dos Correios")
    public void que_eu_estou_nos_sites_dos_correios(){

        //Configurando webdriver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

        //Acessando o site
        driver.get("https:www.correios.com.br/");
    }

    @Quando("informo o CEP {string} na busca")
    public void informo_o_cep_na_busca(String cep){

        //Procurando pelo CEP
        WebElement cepInput = driver.findElement(By.id("acesso-busca"));
        cepInput.sendKeys(cep);
        cepInput.submit();
    }

    @Entao("vejo a mensagem {string}")
    public void vejo_a_mensagem(String mensagem){

        //Verificar se a mensagem de erro é exibida
        WebElement mensagemErro = driver.findElement(By.xpath("//p[contains(text(), " +
                mensagem + ")]"));
        assert(mensagemErro.isDisplayed());
    }

}


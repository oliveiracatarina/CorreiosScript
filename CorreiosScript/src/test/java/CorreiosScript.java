import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import org.openqa.selenium.WebDriver;
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
}


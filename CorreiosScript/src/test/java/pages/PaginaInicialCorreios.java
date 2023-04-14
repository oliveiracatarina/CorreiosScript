package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaInicialCorreios {
     private WebDriver driver;

     public PaginaInicialCorreios(WebDriver driver) {
         this.driver = driver;
         PageFactory.initElements(driver, this);
     }

@FindBy(id = "acesso-busca")
    private WebElement campoBusca;

    public void buscarPorCEP(String cep) {
    campoBusca.sendKeys(cep);
    campoBusca.submit();
}

    public void buscarPorCodigoRastreamento(String codigo) {
        WebElement campoRastreamento = driver.findElement(By.cssSelector(".tracking-input"));
        campoRastreamento.sendKeys(codigo);
        campoRastreamento.submit();
    }

}

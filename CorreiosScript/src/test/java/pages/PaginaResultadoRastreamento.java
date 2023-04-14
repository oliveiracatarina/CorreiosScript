package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaResultadoRastreamento {
    private WebDriver driver;

    public PaginaResultadoRastreamento(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[contains(text(), 'Codigo de objeto invalido')]")
    private WebElement mensagemCodigoInvalido;

    public boolean mensagemCodigoInvalidoExibida(){
        return mensagemCodigoInvalido.isDisplayed();
    }

    public void fecharNavegador() {
        driver.quit();
    }
}

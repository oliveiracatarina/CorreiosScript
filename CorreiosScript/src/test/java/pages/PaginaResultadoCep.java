package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaResultadoCep {
    private WebDriver driver;

    public PaginaResultadoCep(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[contains(text(), 'Endereco nao encontrado')]")
    private WebElement mensagemEnderecoNaoEncontrado;

    @FindBy(xpath = "//p[contains(text(), 'Rua Quinze de Novembro, Sao Paulo/SP')]")
    private WebElement endereco;


    public boolean mensagemEnderecoNaoEncontradoExibida() {
        return mensagemEnderecoNaoEncontrado.isDisplayed();
    }

    public boolean enderecoExibido(String enderecoEsperado) {
        return endereco.getText().equals(enderecoEsperado);
    }

    public void voltarParaPaginaInicial() {
        driver.navigate().back();
    }

}

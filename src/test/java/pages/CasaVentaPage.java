package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import baseconfig.DriverManager;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CasaVentaPage {

    private WebDriver driver;

    /**
     * revisar constructor de clase - No permite utilizar anotaciones FindBy, además no permite utilizar atributo driver especificado en clase Page
     **/
    public CasaVentaPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(this.driver, this);
    }
    public void verificarPrecio(){
        driver.findElement(By.xpath("/html/body/main/div/p"));
        WebElement precioBuscado = driver.findElement(By.xpath("/html/body/main/div/p"));
        Assert.assertEquals("$3,000,000",precioBuscado.getText());

    }


}

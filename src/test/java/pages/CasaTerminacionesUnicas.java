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

public class CasaTerminacionesUnicas {
    private WebDriver driver;

    /**
     * revisar constructor de clase - No permite utilizar anotaciones FindBy, además no permite utilizar atributo driver especificado en clase Page
     **/
    public CasaTerminacionesUnicas() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(this.driver, this);
    }
    public void verificarCantidadBanos(){
        driver.findElement(By.xpath("/html/body/main/div/ul/li[1]/p"));
        WebElement cantidadBanos = driver.findElement(By.xpath("/html/body/main/div/ul/li[1]/p"));
        Assert.assertEquals("3",cantidadBanos.getText());

    }
}

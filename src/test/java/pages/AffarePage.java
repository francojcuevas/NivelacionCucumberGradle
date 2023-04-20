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

public class AffarePage {

    private WebDriver driver;

    /**
     * revisar constructor de clase - No permite utilizar anotaciones FindBy, además no permite utilizar atributo driver especificado en clase Page
     **/
    public AffarePage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(this.driver, this);
    }
    public void clickNosotros(){
        driver.findElement(By.xpath("/html/body/header/div/div[1]/nav/a[1]")).click();
    }

    public void dirigirseASitioWebNosotros(){
        driver.get("https://dibrsite1.netlify.app/html/nosotros.html");
    }

    public void clickVerPropiedad(){
        driver.findElement(By.xpath("/html/body/main/div[1]/div[1]/div/a")).click();
    }

    public void dirigirseAverPropiedad(){
        driver.get("https://dibrsite1.netlify.app/html/anuncio.html");
    }

    public void dirigirseASitioWeb(){
        driver.get("https://dibrsite1.netlify.app/");
    }
}

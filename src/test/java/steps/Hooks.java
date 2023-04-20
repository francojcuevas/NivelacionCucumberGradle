package steps;

import baseconfig.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        DriverManager.resolveDriver();
    }
    @After
    public void closeDriver(){
        DriverManager.getDriver().quit();
    }
}

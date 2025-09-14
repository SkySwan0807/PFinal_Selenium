package stepDefinitions;

import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;

public class CommonSteps {

    @Given("I am in sauce demo web page")
    public void goToSauceDemoPage(){
        DriverManager.getDriver().get("https://www.saucedemo.com");
        //DriverManager.getDriver().manage().window().maximize();
    }


    @And("If you reach this point the test failed")
    public void failedTest(){
        Assertions.fail("El escenario llegó a un punto donde debía fallar.");
    }
}

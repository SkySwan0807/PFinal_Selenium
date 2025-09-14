package stepDefinitions;

import Utilities.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import pages.CheckoutInformationPage;

import java.util.List;

public class CheckoutInformationSteps {
    CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(DriverManager.getDriver());

    @And("I fill the checkout information with")
    public void fillCheckoutInformation(DataTable checkoutInformation){
        List<String> data = checkoutInformation.transpose().asList(String.class);
        //['Jorge', 'Perez', '12345']
        checkoutInformationPage.setFirstNameTextBox(data.get(0));
        checkoutInformationPage.setLastNameTextBox(data.get(1));
        checkoutInformationPage.setZipCodeTextBox(data.get(2));
    }

    @And("I click on the continue button")
    public void clickOnContinue(){
        checkoutInformationPage.clickOnContinueButton();
    }

    @And("A error message that says {string} should say")
    public void verifyErrorMessage(String message){
        Assertions.assertTrue(checkoutInformationPage.errorMessageIsDisplayed(message));
    }

}

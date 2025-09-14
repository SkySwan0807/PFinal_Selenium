package stepDefinitions;

import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.DetailsPage;

public class DetailsSteps {

    DetailsPage detailsPage = new DetailsPage(DriverManager.getDriver());

    @And("I click on add to cart button")
    public void addToCart(){
        detailsPage.clickOnAddButton();
    }

    @When("I click on the cart icon of the detail page")
    public void clickOnCartIcon(){
        detailsPage.clickOnCartIcon();
    }
}

package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.LandingScreen;
import testUI.Configuration;

import static testUI.UIOpen.open;
import static testUI.Utils.AppiumHelps.sleep;

public class LandingSteps {
    private LandingScreen landingScreen = new LandingScreen();

    @Given("I check landing screen")
    public void iOpenTheApplication() {
        landingScreen.checkLandingScreen();
    }

    @When("I click on add shopping list")
    public void iClickOnAddShoppingList() {
        landingScreen.clickAddShoppingList();
    }

    @And("I type {string}")
    public void iType(String arg0) {
        landingScreen.typeInShoppingName(arg0);
    }

    @And("I click on add list")
    public void iClickOnAddList() {
        landingScreen.clickOnAddList();
    }

    @Then("I see new list {string} on landing screen")
    public void iSeeOnLandingScreen(String arg0) {
        landingScreen.checkNewList(arg0);
        sleep(3000);
    }

    @When("I click on a shopping list")
    public void iClickOnAShoppingList() {
    }

    @And("I click on the options button")
    public void iClickOnTheOptionsButton() {
        
    }

    @And("I click the option {string}")
    public void iClickTheOption(String arg0) {
        
    }

    @And("I click on button {string}")
    public void iClickOnButton(String arg0) {
        
    }


    @Then("I see the {string} removed from from the landing screen")
    public void iSeeTheRemovedFromFromTheLandingScreen(String arg0) {
    }
}

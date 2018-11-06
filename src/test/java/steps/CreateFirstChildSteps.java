package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CalculatorPage;
import utils.DriverProvider;

public class CreateFirstChildSteps {
    static CalculatorPage calculatorPage;

    @Before()
    public void beforeHook() {
        DriverProvider.initializeDriver();
        calculatorPage = new CalculatorPage();
    }

    @Given("^I go to website \"([^\"]*)\"$")
    public void iGoToWebsite(String url) {
        DriverProvider.getDriver().get(url);
    }

    @Then("^click the button to begin the calculation$")
    public void clickTheButtonToBeginCalculation() {
        calculatorPage.clickBeginButton();
    }

    @And("^I wait for <(\\d+)> milliseconds$")
    public void iWaitForMilliSeconds(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException itex) {
            itex.printStackTrace();
        }
    }

    @When("^I enter the following for name:([^\"]*) and day of birth:([^\"]*)$")
    public void iEnterTheFollowingForNameAndDateOfBirth(String name, String dateOfBirth) {
        calculatorPage.vulNaamVanKind(name);
        calculatorPage.vulGeboorteDatum(dateOfBirth);
    }

    @And("^the child has no limitations$")
    public void childHasNoLimitations() {
        calculatorPage.clickBeperkingFalseButton();
    }

    @And("^the child has a limitation$")
    public void childHasALimitation() {
        calculatorPage.clickBeperkingTrueButton();
    }

    @And("^I select the following limitation:([^\"]*)$")
    public void iSelectTheFollowingLimitationLimitation(String beperkingBeschrijving) {
        calculatorPage.clickBeperking(beperkingBeschrijving);
    }

    @And("^select that the child is not an orphan")
    public void childIsNotAnOrphan() {
        calculatorPage.clickWeesFalseButton();
    }

    @And("^select that the child is an orphan")
    public void childIsAnOrphan() {
        calculatorPage.clickWeesTrueButton();
    }

    @And("^I click the ToeVoeg-button$")
    public void iClickTheToeVoegButton() {
        calculatorPage.clickAddChildButton();
    }

    @Then("^I select the following for BijslagTrekkende:([^\"]*) and Rechthebbende:([^\"]*)")
    public void chooseSituations(String bijslagTrekSitBeschrijving, String rechtHebSitBeschrijving) {
        calculatorPage.clickSelectBijslagTrekLink();
        iWaitForMilliSeconds(1000);
        calculatorPage.clickBijslagTrekSituatie(bijslagTrekSitBeschrijving);
        iWaitForMilliSeconds(1000);
        calculatorPage.clickSelectRechtHebbendLink();
        iWaitForMilliSeconds(1000);
        calculatorPage.clickRechHebSituatie(rechtHebSitBeschrijving);
    }

    @After()
    public void afterHook() {
        DriverProvider.getDriver().quit();
    }


}

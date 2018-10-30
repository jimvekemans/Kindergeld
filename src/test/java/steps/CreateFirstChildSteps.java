package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class CreateFirstChildSteps {
    @When("^I enter the following for name and date of birth$")
    public void iEnterTheFollowingForNameAndDateOfBirth(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I used a datatable to enter" +
                dataTable.cells().get(0).get(0) + " and " +
                dataTable.cells().get(1).get(0)
        );
    }

    @Given("^I go to website \"([^\"]*)\"$")
    public void iGoToWebsite(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I went to the website: " + arg0);
    }

    @And("^I click the button \"([^\"]*)\"$")
    public void iClickTheButton(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I clicked the button \"" + arg0 + "\"");
    }

    @When("^I enter the following for ([^\"]*) and ([^\"]*)$")
    public void iEnterTheFollowingForNameAndDateOfBirth(String name, String dateOfBirth) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Entering name: " + name + " and dayOfBirth: " + dateOfBirth);
    }

    @Then("^I try to do something else$")
    public void iTryToDoSomethingElse() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("---- Doing something else ----");
    }

    @And("^get a certain ([^\"]*)$")
    public void getACertainOutcome(String outcome) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("This is the outcome XDDXDXDDDDDDDDDDXDDDDDDD LOL ROFLMAOJLKFHJ:KDSF");
    }
}

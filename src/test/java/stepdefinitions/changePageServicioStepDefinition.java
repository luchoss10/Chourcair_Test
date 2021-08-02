package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.AnswerServiciosPage;
import tasks.OpenUp;
import tasks.SelectServiciosOption;


public class changePageServicioStepDefinition {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than luis want change to Servicios in the menu$")
    public void thanLuisWantChangeToServiciosInTheMenu() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage());
    }


    @When("^he select service in the menu$")
    public void heSelectServiceInTheMenu() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(SelectServiciosOption.onThePage());
    }

    @Then("^the page change to Servicios page with the text (.*)$")
    public void thePageChangeToServiciosPage(String question) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerServiciosPage.toThe(question)));
    }

}

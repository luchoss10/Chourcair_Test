package stepdefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AutomationData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.AnswerSearchPage;
import questions.AnswerServiciosPage;
import tasks.ClickOnSearchIcon;
import tasks.OpenUp;

import java.util.List;

public class searchInPageStepDefinition {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than luis want search with the button lens$")
    public void thanLuisWantSearchWithTheButtonLens() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage());
    }

    @When("^he click the button lens$")
    public void heClickTheButtonLens(List<AutomationData> data) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnSearchIcon.insertTheText(data.get(0).getSearch()));
    }

    @Then("^the page change to show results whit (.*)$")
    public void thePageChangeToShowResultsWhit(String question) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerSearchPage.toThe(question)));

    }

}

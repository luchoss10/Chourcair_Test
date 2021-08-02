package tasks;

import model.AutomationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.SearchPage;

public class ClickOnSearchIcon implements Task {

    private String data;

    public ClickOnSearchIcon(String data) {
        this.data = data;
    }

    public static ClickOnSearchIcon insertTheText(String data) {
        return Tasks.instrumented(ClickOnSearchIcon.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchPage.SEARCH_BUTTON),
                Enter.theValue(data).into(SearchPage.SEARCH_BOX),
                Hit.the(Keys.ENTER).keyIn(SearchPage.SEARCH_BOX));
    }
}

package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.ServiciosPage;


public class SelectServiciosOption implements Task {
    public static Performable onThePage() {
        return Tasks.instrumented(SelectServiciosOption.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ServiciosPage.SERVICIOS_MENU_OPTION));
    }
}

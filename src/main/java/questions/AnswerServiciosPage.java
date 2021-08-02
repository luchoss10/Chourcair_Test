package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ServiciosPage;

public class AnswerServiciosPage implements Question<Boolean> {
    private String question;

    public AnswerServiciosPage(String question){
        this.question = question;
    }

    public static AnswerServiciosPage toThe(String question) {
        return new AnswerServiciosPage(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String textInPage = Text.of(ServiciosPage.TEXT_SERVICIOS_PAGE).viewedBy(actor).asString();
        if(question.equals(textInPage)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}

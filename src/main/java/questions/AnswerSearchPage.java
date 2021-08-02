package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SearchPage;

public class AnswerSearchPage implements Question<Boolean>{
    private String question;

    public AnswerSearchPage(String question) {
        this.question = question;
    }

    public static AnswerSearchPage toThe(String question) {
        return new AnswerSearchPage(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String textInResult = Text.of(SearchPage.TEXT_PRUEBAS).viewedBy(actor).asString();
        return (question.equals(textInResult));
    }
}

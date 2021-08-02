package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPage extends PageObject {
    public static final Target SEARCH_BUTTON = Target.the("button that open the ssearch input box").located(By.className("search-icon"));
    public static final Target SEARCH_BOX = Target.the("box to put the search").located(By.id("is-search-input-0"));
    public static final Target TEXT_PRUEBAS = Target.the("text for first result").located(By.xpath("/html/body/div[2]/div[3]/div/div/div/main/article[1]/header/h2/a"));

}

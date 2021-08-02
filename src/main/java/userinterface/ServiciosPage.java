package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ServiciosPage extends PageObject {
    public static final Target SERVICIOS_MENU_OPTION = Target.the("option that redirect us to servicios page").located(By.id("menu-item-6142"));
    public static final Target TEXT_SERVICIOS_PAGE = Target.the("extract the text of the new opened page name servicios").located(By.xpath("/html/body/div[2]/div[3]/div/div/div/main/div/div/div/div/section[5]/div/div/div/div/div/div[1]/div/h2"));


}

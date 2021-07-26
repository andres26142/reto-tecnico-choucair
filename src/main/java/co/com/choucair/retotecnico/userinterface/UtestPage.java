package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com")
public class UtestPage extends PageObject {
    public static final Target JOIN_TODAY_BUTTON =Target.the("button that takes us to the sign up page").located(By.className("unauthenticated-nav-bar__sign-up"));
}

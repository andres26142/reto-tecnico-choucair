package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSignUpPage extends PageObject {
    public static final Target INPUT_FIRSTNAME=Target.the("field that contains the first name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME=Target.the("field that contains the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL=Target.the("field that contains the email").located(By.id("email"));

    public static final Target INPUT_MONTH=Target.the("field to select the birth month").located(By.id("birthMonth"));
    public static final Target INPUT_DAY=Target.the("field to select the birth day").located(By.id("birthDay"));
    public static final Target INPUT_YEAR=Target.the("field to select the birth year").located(By.id("birthYear"));

    public static final Target INPUT_LANGUAGE=Target.the("field to select the language").located(By.xpath("//div[@id='languages']//input[@type='search']"));

    public static final Target BUTTON_NEXT_LOCATION = Target.the("button that send us to the next page").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public static final Target INPUT_CITY=Target.the("field that contains the city").located(By.id("city"));
    public static final Target INPUT_CODE=Target.the("field that contains the postal code").located(By.id("zip"));

    public static final Target BUTTON_NEXT_DEVICES=Target.the("button that lead us to the devices' page").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target DATA_FROM_PC= Target.the("automatic autocompleted data from the user PC").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target BUTTON_REMOVE_PC=Target.the("button that removes the completed automatically data from computer section").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/a/i"));

    public static final Target BUTTON_COMPUTER=Target.the("button that contains the computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_COMPUTER=Target.the("field that contains the computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target BUTTON_VERSION=Target.the("button that contains the version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_VERSION=Target.the("field that contains the version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target BUTTON_LANGUAGE_PC=Target.the("button that contains the pc language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_LANGUAGE_PC=Target.the("field that contains the pc language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target BUTTON_MOBILE=Target.the("button that contains the mobile").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILE=Target.the("field that contains the mobile").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target BUTTON_MODEL=Target.the("button that contains the mobile model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MODEL=Target.the("field that contains the mobile model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target BUTTON_MOBILE_OS=Target.the("button that contains the mobile os").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MOBILE_OS=Target.the("field that contains the mobile os").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target BUTTON_LAST_STEP=Target.the("button that lead us to the last page").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target PASSWORD = Target.the("input field that contains the password").located(By.id("password"));
    public static final Target PASSWORD_CONFIRMATION = Target.the("input field that contains the password confirmation").located(By.id("confirmPassword"));

    public static final Target BUTTON_STAY_INFORMED = Target.the("checkbox that accept to stay informed").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target BUTTON_TERMS = Target.the("checkbox that accept the terms an conditions").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target BUTTON_PRIVACY_POLICY = Target.the("checkbox that accept the privacy policy").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_COMPLETE = Target.the("button that lead us to complete the sgn up process").located(By.xpath("//*[@id=\"laddaBtn\"]"));
    public static final Target COMPLETED_REGISTER = Target.the("page that tell us we are now registered").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}

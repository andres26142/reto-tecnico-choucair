package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.UTestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class Fill implements Task {
    private String strFistName;
    private String strLastName;
    private String strEmailAddress;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strUserLanguage;
    private String strCity;
    private String strZipPostalCode;
    private String strCountry;
    private String strComputerOs;
    private String strOsVersion;
    private String strComputerLanguage;
    private String strMobileDevice;
    private String strModel;
    private String strMobileOs;
    private String strPassword;

    public Fill(String strFistName, String strLastName, String strEmailAddress, String strBirthMonth, String strBirthDay, String strBirthYear, String strUserLanguage, String strCity, String strZipPostalCode, String strCountry, String strComputerOs, String strOsVersion, String strComputerLanguage, String strMobileDevice, String strModel, String strMobileOs, String strPassword) {
        this.strFistName = strFistName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strUserLanguage = strUserLanguage;
        this.strCity = strCity;
        this.strZipPostalCode = strZipPostalCode;
        this.strCountry = strCountry;
        this.strComputerOs = strComputerOs;
        this.strOsVersion = strOsVersion;
        this.strComputerLanguage = strComputerLanguage;
        this.strMobileDevice = strMobileDevice;
        this.strModel = strModel;
        this.strMobileOs = strMobileOs;
        this.strPassword = strPassword;
    }

    public static Fill inThePage(String strFistName, String strLastName, String strEmailAddress, String strBirthMonth, String strBirthDay, String strBirthYear, String strUserLanguage, String strCity, String strZipPostalCode, String strCountry, String strComputerOs, String strOsVersion, String strComputerLanguage, String strMobileDevice, String strModel, String strMobileOs, String strPassword) {
        return Tasks.instrumented(Fill.class,strFistName,strLastName,strEmailAddress,strBirthMonth,strBirthDay,strBirthYear,strUserLanguage,strCity,strZipPostalCode,strCountry,strComputerOs,strOsVersion,strComputerLanguage,strMobileDevice,strModel,strMobileOs,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strFistName).into(UTestSignUpPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(UTestSignUpPage.INPUT_LASTNAME),
                Enter.theValue(strEmailAddress).into(UTestSignUpPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(UTestSignUpPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(strBirthDay).from(UTestSignUpPage.INPUT_DAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(UTestSignUpPage.INPUT_YEAR),
                Click.on(UTestSignUpPage.INPUT_LANGUAGE),
                Enter.theValue(strUserLanguage).into(UTestSignUpPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).keyIn(UTestSignUpPage.INPUT_LANGUAGE),
                Click.on(UTestSignUpPage.BUTTON_NEXT_LOCATION),
                Enter.theValue(strCity).into(UTestSignUpPage.INPUT_CITY),
                Hit.the(Keys.DOWN).keyIn(UTestSignUpPage.INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(UTestSignUpPage.INPUT_CITY),
                Enter.theValue(strZipPostalCode).into(UTestSignUpPage.INPUT_CODE),
                Click.on(UTestSignUpPage.BUTTON_NEXT_DEVICES),

                WaitUntil.the(UTestSignUpPage.DATA_FROM_PC, WebElementStateMatchers.isEnabled()).forNoMoreThan(120).seconds(),
                Click.on(UTestSignUpPage.BUTTON_REMOVE_PC),

                Click.on(UTestSignUpPage.BUTTON_COMPUTER),
                Enter.theValue(strComputerOs).into(UTestSignUpPage.INPUT_COMPUTER),
                Hit.the(Keys.DOWN).keyIn(UTestSignUpPage.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).keyIn(UTestSignUpPage.INPUT_COMPUTER),
                Click.on(UTestSignUpPage.BUTTON_VERSION),
                Enter.theValue(strOsVersion).into(UTestSignUpPage.INPUT_VERSION),
                Hit.the(Keys.DOWN).keyIn(UTestSignUpPage.INPUT_VERSION),
                Hit.the(Keys.ENTER).keyIn(UTestSignUpPage.INPUT_VERSION),
                Click.on(UTestSignUpPage.BUTTON_LANGUAGE_PC),
                Enter.theValue(strComputerLanguage).into(UTestSignUpPage.INPUT_LANGUAGE_PC),
                Hit.the(Keys.DOWN).keyIn(UTestSignUpPage.INPUT_LANGUAGE_PC),
                Hit.the(Keys.ENTER).keyIn(UTestSignUpPage.INPUT_LANGUAGE_PC),

                Click.on(UTestSignUpPage.BUTTON_MOBILE),
                Enter.theValue(strMobileDevice).into(UTestSignUpPage.INPUT_MOBILE),
                Hit.the(Keys.DOWN).keyIn(UTestSignUpPage.INPUT_MOBILE),
                Hit.the(Keys.ENTER).keyIn(UTestSignUpPage.INPUT_MOBILE),
                Click.on(UTestSignUpPage.BUTTON_MODEL),
                Enter.theValue(strModel).into(UTestSignUpPage.INPUT_MODEL),
                Hit.the(Keys.DOWN).keyIn(UTestSignUpPage.INPUT_MODEL),
                Hit.the(Keys.ENTER).keyIn(UTestSignUpPage.INPUT_MODEL),
                Click.on(UTestSignUpPage.BUTTON_MOBILE_OS),
                Enter.theValue(strMobileOs).into(UTestSignUpPage.INPUT_MOBILE_OS),
                Hit.the(Keys.DOWN).keyIn(UTestSignUpPage.INPUT_MOBILE_OS),
                Hit.the(Keys.ENTER).keyIn(UTestSignUpPage.INPUT_MOBILE_OS),

                Click.on(UTestSignUpPage.BUTTON_LAST_STEP),

                Enter.theValue(strPassword).into(UTestSignUpPage.PASSWORD),
                Enter.theValue(strPassword).into(UTestSignUpPage.PASSWORD_CONFIRMATION),
                Click.on(UTestSignUpPage.BUTTON_STAY_INFORMED),
                Click.on(UTestSignUpPage.BUTTON_TERMS),
                Click.on(UTestSignUpPage.BUTTON_PRIVACY_POLICY),

                Click.on(UTestSignUpPage.BUTTON_COMPLETE),

                WaitUntil.the(UTestSignUpPage.COMPLETED_REGISTER, WebElementStateMatchers.isEnabled()).forNoMoreThan(90).seconds()
        );
    }
}

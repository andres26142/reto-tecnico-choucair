package co.com.choucair.retotecnico.stepdefinitions;

import co.com.choucair.retotecnico.model.UTestData;
import co.com.choucair.retotecnico.questions.Answer;
import co.com.choucair.retotecnico.tasks.ClickOn;
import co.com.choucair.retotecnico.tasks.Fill;
import co.com.choucair.retotecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that julian wants to sign up to utest$")
    public void thatJulianWantsToSignUpToUtest() {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenUp.thePage());
    }


    @When("^he clicks on the join today button$")
    public void heClicksOnTheJoinTodayButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOn.joinToday());
    }

    @When("^he introduces his personal data$")
    public void heIntroducesHisPersonalData(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.inThePage(
                uTestData.get(0).getStrFistName(),
                uTestData.get(0).getStrLastName(),
                uTestData.get(0).getStrEmailAddress(),
                uTestData.get(0).getStrBirthMonth(),
                uTestData.get(0).getStrBirthDay(),
                uTestData.get(0).getStrBirthYear(),
                uTestData.get(0).getStrUserLanguage(),
                uTestData.get(0).getStrCity(),
                uTestData.get(0).getStrZipPostalCode(),
                uTestData.get(0).getStrCountry(),
                uTestData.get(0).getStrComputerOs(),
                uTestData.get(0).getStrOsVersion(),
                uTestData.get(0).getStrComputerLanguage(),
                uTestData.get(0).getStrMobileDevice(),
                uTestData.get(0).getStrModel(),
                uTestData.get(0).getStrMobileOs(),
                uTestData.get(0).getStrPassword()

        ));
    }

    @Then("^the register is complete$")
    public void theRegisterIsComplete(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStrSuccessfulSignUpMessage())));
    }
}

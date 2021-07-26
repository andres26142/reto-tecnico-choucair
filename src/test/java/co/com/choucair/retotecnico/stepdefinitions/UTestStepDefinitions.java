package co.com.choucair.retotecnico.stepdefinitions;

import co.com.choucair.retotecnico.model.UTestData;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
        
    }


    @When("^he clicks on the join today button$")
    public void heClicksOnTheJoinTodayButton() {

    }

    @When("^he introduces his personal data$")
    public void heIntroducesHisPersonalData(List<UTestData> uTestData) throws Exception {

    }

    @Then("^the register is complete$")
    public void theRegisterIsComplete() {

    }
}

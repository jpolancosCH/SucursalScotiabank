package com.choucair.sucursalscotiabank.stepdefinitions;

import com.choucair.sucursalscotiabank.model.ScotiabankData;
import com.choucair.sucursalscotiabank.questions.LoginFailed;
import com.choucair.sucursalscotiabank.questions.LoginSuccess;
import com.choucair.sucursalscotiabank.tasks.Login;
import com.choucair.sucursalscotiabank.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class LoginStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());}

    @Given("^Than I am on the login page$")
    public void thanIAmOnTheLoginPage() throws Exception {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenUp.thePage());
    }


    @When("^Enter my username and password, and click login button$")
    public void enterMyUsernameAndPasswordAndClickLoginButton(List<ScotiabankData> scotiabankData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage(scotiabankData.get(0).getUsername(),scotiabankData.get(0).getPassword()));
    }

    @Then("^I should see the login message$")
    public void iShouldSeeTheLoginMessage(List<ScotiabankData> scotiabankData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginSuccess.toThe(scotiabankData.get(0).getSuccessMessage())));
    }

    @Then("^I should see the error message$")
    public void iShouldSeeTheErrorMessage(List<ScotiabankData> scotiabankData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginFailed.toThe(scotiabankData.get(0).getErrorMessage())));
    }
}

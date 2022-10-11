package com.choucair.sucursalscotiabank.stepdefinitions;

import com.choucair.sucursalscotiabank.model.ScotiabankData;
import com.choucair.sucursalscotiabank.questions.LoginFailed;
import com.choucair.sucursalscotiabank.questions.Payment;
import com.choucair.sucursalscotiabank.tasks.Complete;
import com.choucair.sucursalscotiabank.tasks.GoPayCreditcard;
import com.choucair.sucursalscotiabank.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class PaymentStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());}

    @Given("^Than I am on the credit card payment page$")
    public void thanIAmOnTheCreditCardPaymentPage() {
        OnStage.theActorCalled("Julian").wasAbleTo(GoPayCreditcard.page());
    }

    @When("^Complete all the fields$")
    public void completeAllTheFields(List<ScotiabankData> scotiabankData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Complete.theFields(scotiabankData.get(0).getCardNumber(), scotiabankData.get(0).getAmount()));
    }

    @Then("^I should see the message$")
    public void iShouldSeeTheMessage(List<ScotiabankData> scotiabankData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Payment.isReady(scotiabankData.get(0).getLastMessage())));
    }
}

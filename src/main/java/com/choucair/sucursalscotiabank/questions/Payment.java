package com.choucair.sucursalscotiabank.questions;

import com.choucair.sucursalscotiabank.userinterface.ScotiabankCreditCardPaymentPage;
import com.choucair.sucursalscotiabank.userinterface.ScotiabankWelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Payment implements Question<Boolean> {
    private String question;

    public Payment(String question) {
        this.question = question;
    }

    public static Payment isReady(String question) {
        return new Payment(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ScotiabankCreditCardPaymentPage.LABEL_LAST_STEP, isVisible()).forNoMoreThan(10).seconds());
        String labelLastStep = Text.of(ScotiabankCreditCardPaymentPage.LABEL_LAST_STEP).viewedBy(actor).asString();
        return question.equals(labelLastStep);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}

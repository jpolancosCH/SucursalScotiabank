package com.choucair.sucursalscotiabank.questions;

import com.choucair.sucursalscotiabank.userinterface.ScotiabankLoginPage;
import com.choucair.sucursalscotiabank.userinterface.ScotiabankWelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginFailed implements Question<Boolean> {
    private String question;

    public LoginFailed(String question) {
        this.question = question;
    }

    public static LoginFailed toThe(String question) {
        return new LoginFailed(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ScotiabankLoginPage.ERROR_MESSAGE, isVisible()).forNoMoreThan(10).seconds());
        String welcomeMessage = Text.of(ScotiabankLoginPage.ERROR_MESSAGE).viewedBy(actor).asString();
        return question.equals(welcomeMessage);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}

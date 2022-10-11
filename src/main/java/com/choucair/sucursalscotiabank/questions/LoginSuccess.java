package com.choucair.sucursalscotiabank.questions;

import com.choucair.sucursalscotiabank.userinterface.ScotiabankWelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginSuccess implements Question<Boolean> {
    private String question;

    public LoginSuccess(String question) {
        this.question = question;
    }

    public static LoginSuccess toThe(String question) {
        return new LoginSuccess(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ScotiabankWelcomePage.WELCOME_MESSAGE, isVisible()).forNoMoreThan(10).seconds());
        String welcomeMessage = Text.of(ScotiabankWelcomePage.WELCOME_MESSAGE).viewedBy(actor).asString();
        return question.equals(welcomeMessage);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}

package com.choucair.sucursalscotiabank.tasks;

import com.choucair.sucursalscotiabank.userinterface.ScotiabankCreditCardPaymentPage;
import com.choucair.sucursalscotiabank.userinterface.ScotiabankLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Complete implements Task {
    private String creditCard;
    private String amount;

    public Complete(String creditCard, String amount) {
        this.creditCard = creditCard;
        this.amount = amount;
    }

    public static Complete theFields(String creditCard, String amount) {
        return new Complete(creditCard, amount);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(creditCard).into(ScotiabankCreditCardPaymentPage.INPUT_CREDIT_CARD),
                WaitUntil.the(ScotiabankCreditCardPaymentPage.CONTINUE_BUTTON_CREDIT, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(ScotiabankCreditCardPaymentPage.CONTINUE_BUTTON_CREDIT),
                Enter.theValue(amount).into(ScotiabankCreditCardPaymentPage.INPUT_ANOTHER_VALUE),
                WaitUntil.the(ScotiabankCreditCardPaymentPage.CONTINUE_BUTTON_CREDIT, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(ScotiabankCreditCardPaymentPage.CONTINUE_BUTTON_CREDIT),
                Click.on(ScotiabankCreditCardPaymentPage.BUTTON_WHERE_PAY),
                WaitUntil.the(ScotiabankCreditCardPaymentPage.CONTINUE_BUTTON_CREDIT, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(ScotiabankCreditCardPaymentPage.CONTINUE_BUTTON_CREDIT)
        );
    }
}

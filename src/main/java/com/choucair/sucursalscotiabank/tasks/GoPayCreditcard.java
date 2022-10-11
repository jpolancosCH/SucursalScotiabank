package com.choucair.sucursalscotiabank.tasks;

import com.choucair.sucursalscotiabank.userinterface.ScotiabankCreditCardPaymentPage;
import com.choucair.sucursalscotiabank.userinterface.ScotiabankWelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoPayCreditcard implements Task {

    public static GoPayCreditcard page() {
        return new GoPayCreditcard();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ScotiabankWelcomePage.PAYMENT_BUTTON),
                Click.on(ScotiabankCreditCardPaymentPage.NEW_PAYMENT_BUTTON),
                Click.on(ScotiabankCreditCardPaymentPage.OTHER_PEOPLE_CARDS_BUTTON),
                Click.on(ScotiabankCreditCardPaymentPage.CONTINUE_BUTTON)
        );
    }
}

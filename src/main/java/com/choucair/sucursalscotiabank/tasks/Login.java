package com.choucair.sucursalscotiabank.tasks;

import com.choucair.sucursalscotiabank.userinterface.ScotiabankLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String strUser;
    private String strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static Login onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class, strUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strUser).into(ScotiabankLoginPage.USER_INPUT),
                Click.on(ScotiabankLoginPage.PASSWORD_INPUT),
                Enter.theValue(strPassword).into(ScotiabankLoginPage.PASSWORD_INPUT),
                Click.on(ScotiabankLoginPage.LOGIN_BUTTON)
        );
    }
}

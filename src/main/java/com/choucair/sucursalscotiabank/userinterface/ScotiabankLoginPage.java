package com.choucair.sucursalscotiabank.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ScotiabankLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Button to confirm the login").located(By.xpath("//button[@class='button button--primary']"));
    public static final Target USER_INPUT = Target.the("Where do we write the username").located(By.xpath("//input[@placeholder = 'Nombre de usuario']"));
    public static final Target PASSWORD_INPUT = Target.the("Where do we write the password").located(By.xpath("//input[@type='password']"));
    public static final Target ERROR_MESSAGE = Target.the("Label that shows the error message").located(By.xpath("//div[@class = 'error input-group__error']//following::span"));
}

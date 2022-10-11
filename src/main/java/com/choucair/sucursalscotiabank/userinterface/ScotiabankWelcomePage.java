package com.choucair.sucursalscotiabank.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ScotiabankWelcomePage extends PageObject {
    public static final Target WELCOME_MESSAGE = Target.the("Label that shows the welcome message").located(By.xpath("//span[@class='name']"));
    public static final Target PAYMENT_BUTTON = Target.the("button to start the payment").located(By.xpath("//span[contains(text(),'Pagar')]//preceding::div[@class='circle-button']"));

}

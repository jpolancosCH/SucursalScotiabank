package com.choucair.sucursalscotiabank.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ScotiabankCreditCardPaymentPage extends PageObject {
    public static final Target NEW_PAYMENT_BUTTON = Target.the("Button to do a new payment").located(By.xpath("//p[contains(text(),'Hacer un nuevo pago')]//parent::div//parent::div[@class='card']"));
    public static final Target OTHER_PEOPLE_CARDS_BUTTON = Target.the("Button to do payment of other people's cards").located(By.xpath("//div[@class='quick-action disabled']//following::div[@class='quick-action disabled']"));
        public static final Target CONTINUE_BUTTON = Target.the("Button to accept the alert").located(By.xpath("//button[contains(text(),'Continuar')]"));
        public static final Target INPUT_CREDIT_CARD = Target.the("Input to enter the credit card number").located(By.tagName("input"));
        public static final Target CONTINUE_BUTTON_CREDIT = Target.the("Button to continue with the payment").located(By.xpath("//span[contains(text(),'Continuar')]//parent::span//parent::button"));
        public static final Target INPUT_ANOTHER_VALUE = Target.the("Input to enter the value to pay").located(By.tagName("input"));
        public static final Target BUTTON_WHERE_PAY = Target.the("Button to select the account to pay").located(By.xpath("//div[@class='quick-action margin-xs-12--bottom quick-action--without-shadow']"));
        public static final Target LABEL_LAST_STEP = Target.the("Label to confirm all the data").located(By.className("heading"));


}

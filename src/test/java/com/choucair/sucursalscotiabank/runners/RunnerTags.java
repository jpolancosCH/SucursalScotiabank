package com.choucair.sucursalscotiabank.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        tags = "@successful_payment_entering_amount",
        glue = "com.choucair.sucursalscotiabank.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}

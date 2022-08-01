package co.com.tyba.reto.advantageonlineshopping.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static co.com.tyba.reto.advantageonlineshopping.utils.Constantes.ADVANTAGE_ONLINE_SHOPPING;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = ADVANTAGE_ONLINE_SHOPPING,
        glue = {"co.com.tyba.reto.advantageonlineshopping.stepdefinitions", "co.com.tyba.reto.advantageonlineshopping.setup"},
        snippets = CAMELCASE
)
public class AdvantageOnlineShopping {
}

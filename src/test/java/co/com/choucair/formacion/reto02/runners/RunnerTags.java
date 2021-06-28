package co.com.choucair.formacion.reto02.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/Simulador.feature",
        tags = "@Esquema1",
        glue = "co.com.choucair.formacion.reto02.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}

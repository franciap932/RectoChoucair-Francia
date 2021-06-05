package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/Preparate.feature",
        tags=" @prueba1",
        glue={"stepdefinitions", "util"},
        snippets=SnippetType.CAMELCASE
)

public class PreparateRunner {
}

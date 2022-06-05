package co.com.sofka.runner.institucionalsublime;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
        features = { "src/test/resources/feature/institucionalsublime/registro.feature"},
        glue = {"co.com.sofka.stepdefinition.institucionalsublime"}
)

public class TestRegistrar {
}

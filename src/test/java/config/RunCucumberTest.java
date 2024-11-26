package config;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources",        	            // Path: features = "classpath:features"
    glue = "steps",					                        // Path: Steps
    monochrome = false,							            // Cores no Terminal default: false
    snippets = CucumberOptions.SnippetType.UNDERSCORE,		// METHODOS do Steps em CAMELCASE
    dryRun = false,								            // Validar Steps sem executar o teste
    plugin = {									            // Plugins Cucumber para possivel integracao com Jenkins
        "pretty",
        "html:target/cucumber/index.html",
        "json:target/cucumber/index.json"
    }
    //,tags = "not @ecore_invoice_details and not @ecore_login"

    /**
     * Executar testes no termial
     *
     *	$ mvn test
     *	$ mvn test -Dcucumber.options="--tags @tagScenario"
     *
     *	$ mvn clean
     *	$ mvn clean test
     * */
)
public class RunCucumberTest
{
}

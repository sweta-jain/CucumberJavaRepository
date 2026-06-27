package StepDefinitions;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("Features")
@ConfigurationParameter(key = "cucumber.ansi-colors.disabled", value = "true")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "StepDefinitions")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, json:target/json-cucumber-reports/testreport.json, "
		+ "html:target/html-cucumber-reports/testreport.html, "
		+ "junit:target/junit-cucumber-reports/testreport.xml")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@SmokeTest")
public class testRunner {
}

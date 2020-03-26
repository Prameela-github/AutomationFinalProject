package Runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(// Using cucumber options 
		features = "src/main/resources/feature/testcase.feature", //  address of the feature file
		plugin = { "pretty", "html:reports/cucumber-html-report", "json:reports/cucumber-html-report/jsonreport",
				"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html" }, // generating
																											// json,
																											// html and
																											// extent
																											// reports
		tags = { "@TC_01, @TC_02, @TC_03, @TC_04" }, // Tags in the feature file
		glue = { "Stepdefinition" }, // Sticking the Stepdefiniton class
		monochrome = true) // console readable
public class Runner {
	@AfterClass
	public static void extendReport() //  extent reports
	{
		Reporter.loadXMLConfig("src/test/resources/extent-configure.xml");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}

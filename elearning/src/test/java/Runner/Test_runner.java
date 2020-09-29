package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions ( features = {
		//"C:\\DKS\\Workbook\\elearning\\src\\test\\resources\\sign-up\\signup.feature",
		"C:\\DKS\\Workbook\\elearning\\src\\test\\resources\\Login\\login.feature" 
		},		
	glue={"StepDefinition"},
	tags = "@execute", // 
	dryRun=false,//To check weather you have missed an steps in the scenario
	monochrome=true,//to make the console output in a better format
	strict = true,//it will check weather any step is not defined in step definition
	plugin = {"html:testoutput/testoutput.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}

	)
public class Test_runner {

}

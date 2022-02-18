package runer;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"D:\\Selenium\\CucumberTest\\CucumberSelenium\\src\\test\\resources\\Feature\\Scenario.feature"},glue = "HomePage.java",
plugin = {"pretty"},monochrome = true)
public class Runer {
	
	
	
	

}

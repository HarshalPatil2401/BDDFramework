package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features= {"classpath:features/"
                            },
                      glue= {"stepDef"},
                   plugin = { "html:target/My/cucumber-html-report.html", "pretty" })
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	
	}


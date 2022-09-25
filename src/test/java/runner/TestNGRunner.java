package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features= {"C:/Users/Harshal/eclipse-workspace-new/BDDTestNG/src/test/resources/features/check_faq.feature",
		                    "C:/Users/Harshal/eclipse-workspace-new/BDDTestNG/src/test/resources/features/FinoLogin.feature",
		                    "C:/Users/Harshal/eclipse-workspace-new/BDDTestNG/src/test/resources/features/Dashboard.feature",
		                    "C:/Users/Harshal/eclipse-workspace-new/BDDTestNG/src/test/resources/features/login.feature"
                            },
                      glue= {"stepDef"},
                   plugin = { "html:target/My/cucumber-html-report.html", "pretty" })
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	
	}


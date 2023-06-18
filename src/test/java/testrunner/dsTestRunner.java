package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucmbereport.html",},
		monochrome = true,
		//tags = "@webpage ,@homepage_01" ,
		features = {"src/test/resources/features/Array.feature"},
		glue = {"stepdefinition", "hooks"}
		)

public class dsTestRunner {//extends AbstractTestNGCucumberTests {
//    @Override
//	@DataProvider(parallel=false)
//	public Object [][] scenarios() {
//		return super.scenarios();
	//}
	
	
	
	
}

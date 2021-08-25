package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= "src/test/java/feature/Login.feature",
					glue="steps")
public class CucumberTest extends AbstractTestNGCucumberTests{
	
}
/*@CucumberOptions(features= {"src/test/java/feature"}, 
							glue="steps",
							monochrome=true, 
							publish=true,
							tags="@smoke or @sanity"
							)
public class CucumberTest extends AbstractTestNGCucumberTests{
	
}*/

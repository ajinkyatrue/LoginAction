package optimumRunnerPkg;

import org.testng.annotations.Test;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Features", glue = {"optimumStepDef"})
public class OptimumRunner extends AbstractTestNGCucumberTests{
	@Test
	public void TC1() {}
}

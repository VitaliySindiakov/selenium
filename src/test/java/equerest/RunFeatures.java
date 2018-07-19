package equerest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Vitaliy on 07.06.2018.
 */
@CucumberOptions(features = "src/test/resources/features", glue = "com.equerest")
public class RunFeatures extends AbstractTestNGCucumberTests {

}

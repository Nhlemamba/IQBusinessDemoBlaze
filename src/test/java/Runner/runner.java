package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//configuring how tests should be run and the paths of the required files
    @CucumberOptions(
            features = {"src/test/resources/Features"},
            glue = {"Steps"},
     //       plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
            tags =  "@addingToCart",publish = true
    )
    public class runner extends AbstractTestNGCucumberTests {


}

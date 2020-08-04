package org.example;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features=".",tags="@EndtoEnd",dryRun =false,monochrome = true,
        plugin={"pretty","html:target/cukeReport"})
public class RunTest {
}

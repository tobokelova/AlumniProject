package com.test.nhs.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources",//location of feature file feature etsy package //content root
        glue = "com/test/nhs/stepdefinitions",//location of stepdefinitions //source root
        dryRun = false,// responsible to get the snips ,yellow means undefined.it will get new added snips via dryRun
        tags ="@product",
        plugin ={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}// create html report under target

)



public class Runner {

}

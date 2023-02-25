package com.test.nhs.stepdefinitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class Hooks {
    WebDriver driver = DriverHelper.getDriver();

    @Before
    public void navigation(){
        driver.get(ConfigReader.readProperty("nhsurl"));
    }

    @After
    public  void tearDown(){
//        BrowserUtils.getScreenShot(scenario,driver);
        driver.quit();
    }
}

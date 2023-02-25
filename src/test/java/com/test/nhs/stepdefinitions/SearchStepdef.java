package com.test.nhs.stepdefinitions;

import com.test.nhs.pages.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class SearchStepdef {
    WebDriver driver = DriverHelper.getDriver();
    Homepage homepage = new Homepage(driver);

    @Given("the user navigate to the NHS website")
    public void the_user_navigate_to_the_nhs_website() {

        driver.get(ConfigReader.readProperty("nhsurl"));
    }

    @Given("user validates the url of the page")
    public void user_validates_the_url_of_the_page() {
        Assert.assertEquals("http://www.techtorialacademy.link/", driver.getCurrentUrl().trim());

    }

    @When("the user enters the username and password {string}")
    public void the_user_enters_the_username_and_password(String string) {
        homepage.sendingInformation(ConfigReader.readProperty("validusername"), ConfigReader.readProperty("validpassword"));
    }

    @When("the user clicks the SignIn button")
    public void the_user_clicks_the_sign_in_button() {
    }

    @Then("Then the user validates the title")
    public void then_the_user_validates_the_title() {

    }


}

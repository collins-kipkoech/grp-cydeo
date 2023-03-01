package com.cloud.step_definitions;

import com.cloud.pages.LoginPage;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.*;

public class US01_StepDefs {

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get("https://qa.symund.com/index.php/login");

    }
    LoginPage loginPage = new LoginPage();
    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode_userpass123(String username, String password) {
        loginPage.login(username,password);

    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.submit.click();

    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {


    }


}

package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginNegativeStepDef {

    LoginPage loginPage = new LoginPage();

    @Then("verify the error message {string}")
    public void verify_the_error_message(String expectedErrorMsg) {
        Assert.assertEquals(expectedErrorMsg,  loginPage.invalidLoginErrorMsg.getText());
    }
}

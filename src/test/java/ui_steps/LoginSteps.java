package ui_steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class LoginSteps extends CommonMethods {

    @When("user enters different invalid {string} and invalid {string} and {string} and verify the error")
    public void user_enters_different_invalid_and_invalid_and_and_verify_the_error(String userNameValue, String passwordValue, String errorMessageValue) {
        loginPage.usernameTextBox.clear();
        loginPage.passwordTextBox.clear();
        sendText(loginPage.usernameTextBox, userNameValue);
        sendText(loginPage.passwordTextBox, passwordValue);
        loginPage.loginButton.click();
        Assert.assertEquals("Error Message is incorrect", errorMessageValue, loginPage.invalidCredentialsMessage.getText());
    }

    @When("user enters valid username and password and logs in successfully")
    public void user_enters_valid_username_and_password_and_logs_in_successfully(DataTable dataTable) {
        List<Map<String, String>> loginCredentials = dataTable.asMaps();
        loginCredentials.forEach(loginData -> {
            loginPage.usernameTextBox.clear();
            loginPage.passwordTextBox.clear();
            sendText(loginPage.usernameTextBox, loginData.get("username"));
            sendText(loginPage.passwordTextBox, loginData.get("password"));
            click(loginPage.loginButton);
            Assert.assertEquals("Incorrect Welcome Message", "Welcome " + loginData.get("firstname"), dashboardPage.welcomeMessage.getText());
            Assert.assertEquals("Incorrect Page Name", "Human Management System", driver.getTitle());
            click(dashboardPage.welcomeMessage);
            click(dashboardPage.logout);
        });
    }

}

package ui_steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class LanguagesSteps extends CommonMethods {
    @Given("user logs in with valid admin username {string} and password {string}")
    public void user_logs_in_with_valid_admin_username_and_password(String username, String password) {
       sendText(loginPage.usernameTextBox, username);
       sendText(loginPage.passwordTextBox, password);
       click(loginPage.loginButton);
    }

    @When("user navigates to languages")
    public void user_navigates_to_languages() {
        click(dashboardPage.dashBoardPageAdminMenu);
        click(dashboardPage.qualificationsMenu);
        click(dashboardPage.languages);

    }
    @Then("user is able to add language {string} successfully")
    public void user_is_able_to_add_language_successfully(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}

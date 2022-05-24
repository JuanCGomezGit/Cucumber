package ui_steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
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
    public void user_is_able_to_add_language_successfully(String myLanguage) {
        int i = 1;
        for (WebElement language : languagesPage.listOfLanguages) {
            if (language.getText().equalsIgnoreCase(myLanguage)) {
                break;
            }
            i++;
        }
        int flag = 1;
        for (WebElement checkbox : languagesPage.listOfLanguagesCheckBoxes) {
            if (flag == i) {
                click(checkbox);
                break;
            }
            flag++;
        }
        click(languagesPage.deleteLanguageButton);
      //  click(languagesPage.addLanguageButton);
      //  sendText(languagesPage.languageNameTextBox, myLanguage);
     //   click(languagesPage.addLanguageButton);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

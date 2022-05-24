package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    @FindBy(xpath = "//*[@id='welcome']")
    public WebElement welcomeMessage;

    @FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[3]/a")
    public WebElement logout;

    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement dashBoardPageAdminMenu;

    @FindBy(id = "menu_admin_Qualifications")
    public WebElement qualificationsMenu;

    @FindBy(id = "menu_admin_viewLanguages")
    public WebElement languages;



    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;


public class LanguagesPage extends CommonMethods {

    @FindBy(id = "btnAdd")
    public static WebElement addLanguageButton;

    @FindBy(id = "btnDel")
    public static WebElement deleteLanguageButton;

    @FindBy(xpath = "//table[@id='recordsListTable']/tbody/tr/td[1]")
    public static List<WebElement> listOfLanguagesCheckBoxes;

    @FindBy(xpath = "//table[@id='recordsListTable']/tbody/tr/td[2]")
    public static List<WebElement> listOfLanguages;

    public LanguagesPage() {
        PageFactory.initElements(driver, this);

    }
}

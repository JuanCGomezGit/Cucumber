package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;


public class LanguagesPage extends CommonMethods {

    @FindBy(id = "btnAdd")
    public WebElement addLanguageButton;

    @FindBy(id = "btnDel")
    public WebElement deleteLanguageButton;

    @FindBy(xpath = "//table[@id='recordsListTable']/tbody/tr/td[1]")
    public List<WebElement> listOfLanguagesCheckBoxes;

    @FindBy(xpath = "//table[@id='recordsListTable']/tbody/tr/td[2]")
    public List<WebElement> listOfLanguages;

    @FindBy(id="language_name")
    public WebElement languageNameTextBox;


    @FindBy(id="btnSave")
    public WebElement saveLanguageBtn;

    public LanguagesPage() {
        PageFactory.initElements(driver, this);

    }
}

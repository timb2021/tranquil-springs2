package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebDriverUtils;

public class MainPage {

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement summaryButton;

    @FindBy(id = "income")
    public WebElement incomeButton;

    @FindBy(id = "expense")
    public WebElement expenseButton;

    @FindBy(id = "forecast")
    public WebElement forecastButton;

    @FindBy(id = "settings")
    public WebElement settingsButton;


}

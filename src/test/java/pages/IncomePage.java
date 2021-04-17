package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class IncomePage {

    public IncomePage() {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }



}

package pages.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_PF {

    WebDriver driver;
    @FindBy (xpath = "//a[@id='nav-link-accountList']")
    public WebElement signInLink;

    public Dashboard_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSignIn(){
        this.signInLink.click();
    }
}

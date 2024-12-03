package pages.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignPage_PF {

     WebDriver driver;
    @FindBy (xpath = "//a[@id='createAccountSubmit']")
    public WebElement createNewAccount;


    public SignPage_PF(WebDriver driver){
        this. driver= driver;
        PageFactory.initElements(driver, this);
    }


    public void createAccountBtn(){
        this.createNewAccount.click();
    }

}

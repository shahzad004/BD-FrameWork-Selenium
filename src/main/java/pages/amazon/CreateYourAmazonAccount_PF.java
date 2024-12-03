package pages.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateYourAmazonAccount_PF {

   WebDriver driver;

    @FindBy (xpath = "//input[@name='customerName']")
    public WebElement nameField;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement emailField;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordField;

    @FindBy (xpath = "//input[@name='passwordCheck']")
    public WebElement confirmPasswordField;


    @FindBy (id = "continue")
    public WebElement submitBtn;



    public CreateYourAmazonAccount_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void enterName(String name){
        this.nameField.sendKeys(name);
    }


    public void enteremail(String email){
        this.emailField.sendKeys(email);
    }

    public void enterPassword(String pass){
        this.passwordField.sendKeys(pass);
    }

    public void re_enterPass(String pass){
        this.confirmPasswordField.sendKeys(pass);
    }

    public  void submitBtn(){
        this.submitBtn.click();
    }


}

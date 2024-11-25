package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookMainPagePF {


    public WebDriver driver;

    @FindBy (xpath = "//a[text()='Create new account']")
    public WebElement createAccountBtn;


    @FindBy (xpath = "//a[text()='Already have an account?']")
    public WebElement haveAccount;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement signInEmail;

    @FindBy (xpath = "//input[@name='pass']")
    public WebElement pass;

    @FindBy (xpath = "//button[@id='loginbutton']")
    public WebElement logInBtn;



    public FacebookMainPagePF(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);


    }

    public void clickCreateBtn(){
        this.createAccountBtn.click();
        this.haveAccount.click();


    }

    public void signIndetails(){
        this.signInEmail.sendKeys("khan@gmail.com");
        this.pass.sendKeys("324234");

        this.logInBtn.click();
    }

}

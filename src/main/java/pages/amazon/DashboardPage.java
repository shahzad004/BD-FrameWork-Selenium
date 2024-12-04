package pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

 WebDriver driver;

 public final WebElement signIn;


    public DashboardPage(WebDriver driver) {
        this.driver=driver;

        this.signIn=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
    }



    public void clickOnSignInButton(){
        signIn.click();
    }
}

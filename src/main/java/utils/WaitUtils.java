package utils;

import config.ConfigManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static javax.accessibility.AccessibleState.VISIBLE;
import static javax.swing.TransferHandler.NONE;

public class WaitUtils {



    public static  Duration getTimeout(){
        String timeoutValue= ConfigManager.getProperty("timeout");
       int timeoutInSeconds = (timeoutValue!= null) ? Integer.parseInt(timeoutValue) : 10 ;

        return Duration.ofSeconds(timeoutInSeconds);
    }

// for Global wait

    public static void applyGlobalWait(){
        boolean enableWait =Boolean.parseBoolean( ConfigManager.getProperty("EnableWait"));
        int timeoutInSeconds = Integer.parseInt(ConfigManager.getProperty("waitInSeconds"));
        System.out.println(" is Wait Enable : "+ enableWait);
        System.out.println("Time in Seconds: "+ timeoutInSeconds);

        if(enableWait && timeoutInSeconds>0){
            try{
                Thread.sleep(timeoutInSeconds * 1000L );
            } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
                System.out.println("Global Wait Interrupted ");
            }

        }
    }



    public static WebElement applyWait(WebDriver driver, WebElement webElement, WaitStrategy waitStrategy){
        WebDriverWait  wait=new  WebDriverWait(driver, getTimeout() );
        switch ( waitStrategy ){
            case    ClICKABLE:
                return wait.until(ExpectedConditions.elementToBeClickable(webElement));
            case  VISIBLE :
                return wait.until(ExpectedConditions.visibilityOf(webElement));

            case NONE :
                return   wait.until(ExpectedConditions.visibilityOf(webElement));

            default:
                return  webElement;

        }
    }
//
     public static WebElement applyWait(WebDriver driver, WebElement webElement, WaitStrategy waitStrategy, By element){
        WebDriverWait  wait=new  WebDriverWait(driver, getTimeout() );
        switch ( waitStrategy ){
            case    ClICKABLE:
                return wait.until(ExpectedConditions.elementToBeClickable(webElement));
            case  VISIBLE :
                return wait.until(ExpectedConditions.visibilityOf(webElement));
            case PRESENCE:
                return wait.until(ExpectedConditions.presenceOfElementLocated(element));
            case NONE :
                return   wait.until(ExpectedConditions.visibilityOf(webElement));

            default:
                return  webElement;

        }
     }

     public static WebElement waitForPresense(WebDriver driver, By element ){
        WebDriverWait wait = new WebDriverWait(driver, getTimeout());
         return wait.until(ExpectedConditions.presenceOfElementLocated(element));

     }



}

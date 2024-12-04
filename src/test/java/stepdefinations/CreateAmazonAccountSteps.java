package stepdefinations;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.amazon.CreateYourAmazonAccount_PF;
import pages.amazon.Dashboard_PF;
import pages.amazon.SignPage_PF;

public class CreateAmazonAccountSteps extends BaseTest {

    Dashboard_PF dashboardPage;
    SignPage_PF signPagePage;
    CreateYourAmazonAccount_PF createYourAmazonAccountPage;


    @Before
    public void setupDriver(){
        setup();
       this.createYourAmazonAccountPage=new CreateYourAmazonAccount_PF(driver);
      this.dashboardPage =new Dashboard_PF(driver);
      this.signPagePage=new SignPage_PF(driver);


    }



    @Given("I am on the amazon web page")
    public void I_am_on_the_amazon_web_page(){
        Assert.assertEquals( "failed","https://www.amazon.com/" , driver.getCurrentUrl());

    }

    @When("I will click on signIn button")
    public void I_will_click_on_signIn_button(){
        System.out.println("hi ");

        dashboardPage.clickSignIn();}

    @Then("I will click on Create amazon account button")
    public void I_will_click_on_Create_amazon_account_button(){

        signPagePage.createAccountBtn();
    }

    @And("I will enter username as value for your name field")
    public void I_will_enter_username_as_value_for_your_name_field(){

        createYourAmazonAccountPage.enterName("John khan");
    }

    @And("I will enter phoneNumber as value for phone number field")
    public  void I_will_enter_phoneNumber_as_value_for_phone_number_field(){

        createYourAmazonAccountPage.enteremail("254968541");
    }

    @And("I will enter password as a valid password value for password field")
    public void I_will_enter_password_as_a_valid_password_value_for_password_field(){

        createYourAmazonAccountPage.enterPassword("john@123");
    }

    @And("I will re-enter password as a valid password value for re-enter password field")
    public void I_will_re_enter_password_as_a_valid_password_value_for_password_field(){

        createYourAmazonAccountPage.re_enterPass("john@123");
    }

    @Then("I click on verify mobile number button")
    public void I_click_on_verify_mobile_number_button(){

        createYourAmazonAccountPage.submitBtn();
    }

    @After
    public void setTearDown(){
        tearDown();
    }
}

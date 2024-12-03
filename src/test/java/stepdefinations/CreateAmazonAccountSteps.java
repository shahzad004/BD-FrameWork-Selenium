package stepdefinations;

import base.BaseTest;
import config.ConfigManager;
import io.cucumber.java.en.Given;
import org.junit.After;
import org.junit.Before;

public class CreateAmazonAccountSteps extends BaseTest {

    @Before
    public void setupDriver(){
        setup();
    }

    @Given("I am on the amazon web page")
    public void I_am_on_the_amazon_web_page(){
        driver.get(ConfigManager.getProperty("baseUrl"));
    }





    @After
    public void setTearDown(){
        tearDown();
    }
}

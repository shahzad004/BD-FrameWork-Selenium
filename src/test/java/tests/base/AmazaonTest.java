package tests.base;

import base.BaseTest;
import enums.WaitStrategy;
import org.testng.annotations.Test;
import pages.amazon.CreateYourAmazonAccount_PF;
import pages.amazon.Dashboard_PF;
import pages.amazon.SignPage_PF;
import utils.WaitUtils;

public class AmazaonTest extends BaseTest {


    @Test
            public void myTest(){
    Dashboard_PF dashboardPF= new Dashboard_PF(driver);
    SignPage_PF signPagePf=new SignPage_PF(driver);
    CreateYourAmazonAccount_PF createPF=new CreateYourAmazonAccount_PF(driver);


        WaitUtils.applyGlobalWait();
        dashboardPF.clickSignIn();

        WaitUtils.applyWait(driver,signPagePf.createNewAccount, WaitStrategy.PRESENCE);
        signPagePf.createAccountBtn();

        createPF.enterName("khan");
        createPF.enteremail("khan3234@gmail.com");
        createPF.enterPassword("kh2343");
        createPF.re_enterPass("kh2343");

        WaitUtils.applyWait(driver,createPF.submitBtn, WaitStrategy.ClICKABLE);
        createPF.submitBtn();



}}

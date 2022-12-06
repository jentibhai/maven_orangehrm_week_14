package com.hrmlive.testsuite;

import com.hrmlive.pages.HomePage;
import com.hrmlive.pages.LoginPage;
import com.hrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginPageTest extends BaseTest {

    /*userSholdLoginSuccessfullyWithValidCredentials
     * Enter “Admin” username
     * Enter “admin123“ password
     * Click on ‘LOGIN’ button
     * * Verify the ‘Dashboard’ text is display
     * userShouldNavigateToForgotPasswordPageSuccessfully *
     * click on the ‘Forgot your password’ link
     * * Verify the text ‘Reset Password’*/
    HomePage homePage = new HomePage();

    LoginPage loginPage = new LoginPage();

    @Test

    public void userSholdLoginSuccessfullyWithValidCredentials(){

        loginPage.enteruserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();
        String expextedText ="Dashboard";
        String actualText =loginPage.getErrorMessage();
        Assert.assertEquals(actualText,expextedText,"Dashboard message not shown");
    }

    @Test

    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        loginPage.clickOnForgotPassword();
        String expectedText ="Reset Password";
        String actualText =loginPage.resetpassword();
        Assert.assertEquals(actualText,expectedText,"Reset Password not showing");

    }





}

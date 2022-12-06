package com.hrmlive.pages;

import com.hrmlive.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By username = By.name("username");

    By Password =By.name("password");

    By loginButton =By.xpath("//button[@type='submit'] ");

    By forgotPassword =By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header'] ");

    By errorMessage = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    By errorMessage1 = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']");


    public void enteruserName(String Username){sendTextToElement(username,Username);}

    public void enterPassword(String password){sendTextToElement(Password,password);}

    public void clickLoginButton(){clickOnElement(loginButton);}

    public String getErrorMessage(){return getTextFromElement(errorMessage);}

    public void clickOnForgotPassword(){clickOnElement(forgotPassword);}

    public String resetpassword(){return getTextFromElement(errorMessage1);}



}

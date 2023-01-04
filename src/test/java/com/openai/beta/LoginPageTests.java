package com.openai.beta;

import com.openapi.beta.driver.WebDriver;
import com.openapi.beta.pageobject.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTests {

    private final LoginPage loginPage = PageFactory.initElements(WebDriver.getInstance().getDriver(), LoginPage.class);


    @Test
    void loginPageTest(){
        loginPage.typeUsername("alex.bayda@yahoo.ca").typePassword("1q2w3e4r").submitLogin();
    }


}
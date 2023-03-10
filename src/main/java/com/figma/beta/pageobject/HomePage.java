package com.figma.beta.pageobject;

import com.figma.beta.logger.Logs;
import com.figma.beta.utilities.WaitToLoad;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "menu-toggle")
    public WebElement hamburgerMenuLocator;

    @FindBy(css = "#sidebar-wrapper > ul > li:nth-child(4) > a")
    public WebElement loginHamburgerButtonLocator;

    @FindBy(id = "btn-login")
    public WebElement loginButtonLocator;

    @FindBy(css = "#sidebar-wrapper > ul > li:nth-child(3) > a")
    public WebElement homeButtonLocator;

    @FindBy(id = "btn-make-appointment")
    public WebElement makeAppointmentButtonLocator;

    Logs logs = new Logs();


    public void openHomePage() {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WaitToLoad.waitForElement(driver, hamburgerMenuLocator, 30);
        logs.process("Homepage has successfully opened");
    }

    public void openLoginPage() {
        hamburgerMenuLocator.click();
        loginHamburgerButtonLocator.click();
        logs.process("Login page has successfully opened");
    }

    public boolean isHomepageElementDisplayed(WebElement element) {
        WaitToLoad.waitForElement(driver, element, 30);
        return true;
    }
}

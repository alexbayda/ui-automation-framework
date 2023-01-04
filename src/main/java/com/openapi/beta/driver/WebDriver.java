package com.openapi.beta.driver;


import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {
    private final org.openqa.selenium.WebDriver driver;
    private static WebDriver instanceOfDriver;

    private WebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }


    public static WebDriver getInstance() {
        if (instanceOfDriver == null) {
            instanceOfDriver = new WebDriver();
        }

        return instanceOfDriver;
    }

    public org.openqa.selenium.WebDriver getDriver() {
        return driver;
    }
}

//http://makeseleniumeasy.com/2018/01/11/singleton-design-pattern-in-selenium-webdriver/

package org.grup56.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][1]")
    public WebElement elements;

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][2]")
    public WebElement forms;

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][3]")
    public WebElement alertsFrameWindows;

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][4]")
    public WebElement widgets;

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][5]")
    public WebElement interaction;

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][6]")
    public WebElement bookStoreApp;

    @FindBy(xpath = "https://www.toolsqa.com/selenium-training/")
    public WebElement toolsQASelenium;
}

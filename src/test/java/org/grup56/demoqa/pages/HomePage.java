package org.grup56.demoqa.pages;

import org.grup56.demoqa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{



    @FindBy(xpath = "//div[@class='category-cards']/div[2]")
    public WebElement forms;

    @FindBy(xpath = "//div[@class='category-cards']/div[3]")
    public WebElement alertsFrameWindows;

    @FindBy(xpath = "//div[@class='category-cards']/div[4]")
    public WebElement widgets;

    @FindBy(xpath = "//div[@class='category-cards']/div[5]")
    public WebElement interaction;

    @FindBy(xpath = "//div[@class='category-cards']/div[6]")
    public WebElement bookStoreApp;
    @FindBy(xpath = "//div[@class='category-cards']/div[1]")
    public WebElement elements;

    @FindBy(xpath = "//a[@href='https://www.toolsqa.com/selenium-training/']")
    public WebElement seleniumJoin;

    @FindBy(xpath = "//div[@class='category-cards']/div")
    public List<WebElement> menuList;

    public void menuItems(String itemName){
        Driver.get().findElement(By.xpath("//h5[text()='" + itemName + "']/../../..")).click();
    }
}

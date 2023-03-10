package org.grup56.demoqa.pages;

import org.grup56.demoqa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@href='https://demoqa.com']")
    WebElement homeIcon;

    @FindBy(xpath = "//footer//span")
    WebElement footer;
}

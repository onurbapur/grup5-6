package org.grup56.demoqa.test.task01;

import org.grup56.demoqa.pages.HomePage;
import org.grup56.demoqa.test.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HomePageTest extends TestBase {
    /*  Test1
    -Navigate to https://demoqa.com/
    -clik to Selenium Certification Tranining/JOIN NOW
    -verify that "https://www.toolsqa.com/selenium-training/" website is opened on the new tab
     */

    @Test
    public void openNewWindow() {

        HomePage homePage = new HomePage();

        extentLogger = report.createTest("Open toolsqa.com on new window");

        extentLogger.info("Navigate to https://demoqa.com");

        extentLogger.info("Click to Selenium Certification Traning/JOİN NOW");
        homePage.seleniumJoin.click();

       // System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        extentLogger.info("Get windows id number");

        Set<String> windows = driver.getWindowHandles();

        //System.out.println("windows = " + windows);

        boolean thereIsWindow = false;

        for(String tab:windows){
            driver.switchTo().window(tab);
            if (driver.getCurrentUrl().equals("https://www.toolsqa.com/selenium-training/")){
                thereIsWindow = true;
            }
        }

        extentLogger.info("verify that the Selenium Window is open");
        Assert.assertTrue(thereIsWindow);

        extentLogger.info("PASSED");
    }


    /*  Test2
    -Navigate to https://demoqa.com/
    -verify that the menu has 6 items.
     */

    @Test
    public void listOfElements() {

        HomePage homePage = new HomePage();

        extentLogger = report.createTest("List of elements test");

        extentLogger.info("Navigate to demoqa.com");

        extentLogger.info("Get list of Menu Items");
        List<WebElement> menuList = homePage.menuList;

        extentLogger.info("Verify that Size of list is 6.");
        Assert.assertEquals(menuList.size(), 6);

        extentLogger.info("PASSED");
    }
}

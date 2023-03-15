package org.grup56.demoqa.test.task01;

import org.grup56.demoqa.pages.HomePage;
import org.grup56.demoqa.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasePageTest extends TestBase {
    /*  Test1
    -Navigate to https://demoqa.com
    -Click to TOOLSQA for going to home page
    -verify that the currentUrl is "https://demoqa.com/"
     */
    @Test
    public void Test1() {

        HomePage homePage = new HomePage();

        extentLogger = report.createTest("Base page home icon test");

        extentLogger.info("Navigate to demoqa.com");

        extentLogger.info("Click to HomeIcon");
        homePage.homeIcon.click();

        extentLogger.info("verify that the currentUrl is \"https://demoqa.com/\"");
        Assert.assertEquals(homePage.getCurUrl(), "https://demoqa.com/");



        extentLogger.info("PASSED");
    }
     /*  Test2
    -Navigate to https://demoqa.com/
    -get text from footer of page
    -verify that the text is "© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED."
     */
    @Test
    public void test2() {
        HomePage homePage = new HomePage();

        extentLogger = report.createTest("Base page footer test");

        extentLogger.info("Navigate to demoqa.com");

        extentLogger.info("Get the text from footer");
        String footerText = homePage.footer.getText();

        extentLogger.info("Verify that Footer text is '© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.'");
        Assert.assertEquals(footerText, "© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.");

        extentLogger.info("PASSED");
    }
}

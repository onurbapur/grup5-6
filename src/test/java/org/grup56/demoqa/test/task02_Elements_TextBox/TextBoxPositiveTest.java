package org.grup56.demoqa.test.task02_Elements_TextBox;

import org.grup56.demoqa.pages.ElementsTextBox;
import org.grup56.demoqa.pages.HomePage;
import org.grup56.demoqa.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxPositiveTest extends TestBase {
    /*  Test1
    -Navigate to https://demoqa.com/
    -Click to Text Box in the submenu of Elements
    -Enter the data to boxes
        Data: Full Name         : "Ahmet Falanca"
              Email             : "falancaAhmet@falanca.com"
              Current address   : "Istanbul/TURKEY"
              Permanent Address : "Ankara/TURKEY"
    -Click to Submit
    -verify that the registration card is visible under the Submit Button
     */

    @Test
    public void successReg() {

        HomePage homePage = new HomePage();
        ElementsTextBox elementsTextBox = new ElementsTextBox();

        extentLogger = report.createTest("Successfully registration");

        extentLogger.info("Navigate to demoqa.com");

        extentLogger.info("Click to Elements Button");
        homePage.elements.click();

        extentLogger.info("Click to Text Box Button");
        elementsTextBox.textBox.click();

        extentLogger.info("Verify that outPutBox is not display");
        Assert.assertFalse(elementsTextBox.outPutBox.isDisplayed(), "outputbox mustnt be display!");

        extentLogger.info("enter the credential to form");
        elementsTextBox.fullname.sendKeys("Ahmet Falanca");
        elementsTextBox.userEmail.sendKeys("falancaAhmet@falanca.com");
        elementsTextBox.currentAddress.sendKeys("Istanbul/TURKEY");
        elementsTextBox.permanentAddress.sendKeys("Ankara/TURKEY");

        extentLogger.info("Click to Submit Button");
        elementsTextBox.btnSubmit.click();

        extentLogger.info("Verify that outPutBox is display");
        Assert.assertTrue(elementsTextBox.outPutBox.isDisplayed(), "outputbox must be display!");

        extentLogger.info("PASSED");


    }

    /*  Test2
    -Navigate to https://demoqa.com/
    -Click to Text Box in the submenu of Elements
    -Enter the data to boxes
        Data: Full Name         : "Ahmet Falanca"
              Email             : "falancaAhmet@falanca.com"
              Current address   : "Istanbul/TURKEY"
              Permanent Address : "Ankara/TURKEY"
    -Click to Submit
    -verify that the form is returns empty
     */

    @Test
    public void getEmptyBoxes() {
        HomePage homePage = new HomePage();
        ElementsTextBox elementsTextBox = new ElementsTextBox();

        extentLogger = report.createTest("Get Empty Boxes after Successfully registration");

        extentLogger.info("Navigate to demoqa.com");

        extentLogger.info("Click to Elements Button");
        homePage.elements.click();

        extentLogger.info("Click to Text Box Button");
        elementsTextBox.textBox.click();

        extentLogger.info("enter the credential to form");
        elementsTextBox.fullname.sendKeys("Ahmet Falanca");
        elementsTextBox.userEmail.sendKeys("falancaAhmet@falanca.com");
        elementsTextBox.currentAddress.sendKeys("Istanbul/TURKEY");
        elementsTextBox.permanentAddress.sendKeys("Ankara/TURKEY");

        extentLogger.info("Click to Submit Button");
        elementsTextBox.btnSubmit.click();

        extentLogger.info("Verify that boxes are empty");
        Assert.assertEquals(elementsTextBox.fullname.getAttribute("value"), "");

        extentLogger.info("PASSED");

    }
}

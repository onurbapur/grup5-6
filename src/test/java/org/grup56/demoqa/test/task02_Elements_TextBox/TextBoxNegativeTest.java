package org.grup56.demoqa.test.task02_Elements_TextBox;

import org.grup56.demoqa.pages.ElementsTextBox;
import org.grup56.demoqa.pages.HomePage;
import org.grup56.demoqa.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxNegativeTest extends TestBase {
    /*  Test1
    -Navigate to https://demoqa.com/
    -Click to Text Box in the submenu of Elements
    -Enter the data to boxes
        Data: Full Name         : "Ahm"
              Email             : ""
              Current address   : "Istanbul/TURKEY"
              Permanent Address : "Ankara/TURKEY"
    -Click to Submit
    -verify that the registration card is not visible under the Submit Button or get message that the Email box cannot be empty
     */

    @Test
    public void emptyEmail() {
        HomePage homePage = new HomePage();
        ElementsTextBox elementsTextBox = new ElementsTextBox();

        extentLogger = report.createTest("Empty Email");

        extentLogger.info("Navigate to demoqa.com");

        extentLogger.info("Click to Elements Button");
        homePage.elements.click();

        extentLogger.info("Click to Text Box Button");
        elementsTextBox.textBox.click();

        extentLogger.info("enter the credential to form");
        elementsTextBox.fullname.sendKeys("Ahm");

        extentLogger.info("Enter nothing to email box");
        elementsTextBox.userEmail.sendKeys("");

        elementsTextBox.currentAddress.sendKeys("Istanbul/TURKEY");
        elementsTextBox.permanentAddress.sendKeys("Ankara/TURKEY");

        extentLogger.info("Click to Submit Button");
        elementsTextBox.btnSubmit.click();

        extentLogger.info("Verify that outPutBox is not display");
        Assert.assertFalse(elementsTextBox.outPutBox.isDisplayed(), "outputbox must not be display!");


        extentLogger.info("PASSED");
    }


    /*  Test2
    -Navigate to https://demoqa.com/
    -Click to Text Box in the submenu of Elements
    -Enter the data to boxes
        Data: Full Name         : "Ahmet Falanca"
              Email             : "falancaAhmetfalanca.com"
              Current address   : "Istanbul/TURKEY"
              Permanent Address : "Ankara/TURKEY"
    -Click to Submit
    -verify that the registration card is not visible under the Submit Button or get message that the Email box icludes the "@".
     */
    @Test
    public void invalidEmail() {
        HomePage homePage = new HomePage();
        ElementsTextBox elementsTextBox = new ElementsTextBox();


        extentLogger = report.createTest("Invalid Email");

        extentLogger.info("Navigate to demoqa.com");

        extentLogger.info("Click to Elements Button");
        homePage.elements.click();

        extentLogger.info("Click to Text Box Button");
        elementsTextBox.textBox.click();

        extentLogger.info("enter the credential to form");
        elementsTextBox.fullname.sendKeys("Ahm");

        extentLogger.info("Enter \"falancaAhmetfalanca.com\" to email box without '@'");
        elementsTextBox.userEmail.sendKeys("falancaAhmetfalanca.com");

        elementsTextBox.currentAddress.sendKeys("Istanbul/TURKEY");
        elementsTextBox.permanentAddress.sendKeys("Ankara/TURKEY");

        extentLogger.info("Click to Submit Button");
        elementsTextBox.btnSubmit.click();

        extentLogger.info("Verify that outPutBox is not display");
        Assert.assertFalse(elementsTextBox.outPutBox.isDisplayed(), "outputbox must not be display!");

        extentLogger.info("PASSED");
    }
}

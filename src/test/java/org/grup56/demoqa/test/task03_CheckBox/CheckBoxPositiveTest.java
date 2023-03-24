package org.grup56.demoqa.test.task03_CheckBox;

import org.grup56.demoqa.pages.ElementsCheckBox;
import org.grup56.demoqa.pages.HomePage;
import org.grup56.demoqa.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxPositiveTest extends TestBase {
     /*  Test1
    -Navigate to https://demoqa.com/
    -Click to Elements
    -Click to Check Box
    -Click on home file
    -Verify this note"You have selected :home desktop notes commands documents workspace react angular veu
    office public private classified general downloads wordFile excelFile "
    */

    @Test
    public void selectHomeFileTest() {

        HomePage homePage = new HomePage();
        ElementsCheckBox elementsCheckBox = new ElementsCheckBox();

        extentLogger = report.createTest("Select all file by select Home file");

        extentLogger.info("Navigate to demoqa.com");

        extentLogger.info("Click to Elements Button");
        homePage.elements.click();

        extentLogger.info("Click to Check Box");
        elementsCheckBox.checkBox.click();

        extentLogger.info("Select the Home");
        elementsCheckBox.homeCheckBox.click();

        extentLogger.info("Vrify that result paragraph is not display");
        Assert.assertTrue(elementsCheckBox.result.isDisplayed(), "result must be display");

        //System.out.println("elementsCheckBox.result.getText() = " + elementsCheckBox.result.getText());
    }
/* Test2
    -Navigate to https://demoqa.com/
    -Click to Elements
    -Click to Check Box
    -Click to (+)Plus button and click to Download toggle and verify Word File.doc Excel File.doc
    -Click to Excel File.doc box verify that "You have selected : excelFile"
    * */

    @Test
    public void clickDownloadCheckBox() {
        HomePage homePage = new HomePage();
        ElementsCheckBox elementsCheckBox = new ElementsCheckBox();

        extentLogger = report.createTest("Download CheckBox Test");

        extentLogger.info("Navigate to demoqa.com");

        extentLogger.info("Click to Elements Button");
        homePage.elements.click();

        extentLogger.info("Click to Check Box");
        elementsCheckBox.checkBox.click();

        extentLogger.info("Click to Plus Button");
        elementsCheckBox.plusButton.click();

        extentLogger.info("Click Download File Button");
        elementsCheckBox.downloadFile.click();

        extentLogger.info("Verify Expected Text");
        String expectedText = "You have selected :\n" + "downloads\n" + "wordFile\n" + "excelFile";
        Assert.assertEquals(elementsCheckBox.result.getText(), expectedText);

        extentLogger.info("PASSED");
    }
}

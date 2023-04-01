package org.grup56.demoqa.test.task04_Radio_Button;

import org.grup56.demoqa.pages.ElementsCheckBox;
import org.grup56.demoqa.pages.ElementsRadioButton;
import org.grup56.demoqa.pages.HomePage;
import org.grup56.demoqa.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonPositive extends TestBase {

    /* test1: Radio buttons are clickable

    -Navigate to https://demoqa.com/
    -Click to Elements
    -Click to Radio Button
    -Verify that three Radio Buttons are clickable
     */

    @Test
    public void radioButtonsAreClickable() {
        HomePage homePage = new HomePage();
        ElementsRadioButton elementsRadioButton = new ElementsRadioButton();

        extentLogger = report.createTest("Radio Buttons are clickable.");

        extentLogger.info("Navigate to demoqa.com");

        extentLogger.info("Click to Elements Button");
        homePage.elements.click();

        extentLogger.info("Click to Radio Button");
        elementsRadioButton.radioButton.click();

        extentLogger.info("Verify that Radio Buttons are clickable");
        Assert.assertTrue(elementsRadioButton.yesRadio.isEnabled(), "Yes radio button must be enable");
        Assert.assertTrue(elementsRadioButton.impressiveRadio.isEnabled(), "Impressive radio button must be enable");
        Assert.assertTrue(elementsRadioButton.noRadio.isEnabled(), "No radio button must be enable");

        extentLogger.info("PASSED");
    }
/* test2 : Display "You have selected Yes" when Click to "Yes"

    -Navigate to https://demoqa.com/
    -Click to Elements
    -Click to Radio Button
    -Click to "Yes" Radio button
    Verify that "You have selected Yes" text are Display
     */

    @Test
    public void testYesRadioButton() {
        HomePage homePage = new HomePage();
        ElementsRadioButton elementsRadioButton = new ElementsRadioButton();

        extentLogger = report.createTest("Yes Radio Button Test");

        extentLogger.info("Navigate to demoqa.com");

        extentLogger.info("Click to Elements Button");
        homePage.elements.click();

        extentLogger.info("Click to Radio Button");
        elementsRadioButton.radioButton.click();

        Assert.assertFalse(elementsRadioButton.yesRadio.isSelected());

        extentLogger.info("Click to \"Yes\" Radio button");
        elementsRadioButton.yesLabel.click();

        extentLogger.info("Verify 'Yes' text");
        Assert.assertTrue(elementsRadioButton.yesRadio.isSelected());
        Assert.assertEquals(elementsRadioButton.resultText.getText(), "You have selected Yes");
    }
    /* test3 : Display "You have selected Impressive" when Click to "Impressive"

    -Navigate to https://demoqa.com/
    -Click to Elements
    -Click to Radio Button
    -Click to "Impressive" Radio button
    Verify that "You have selected Impressive" text are Display
     */
    @Test
    public void testImpressiveRadioButton() {
        HomePage homePage = new HomePage();
        ElementsRadioButton elementsRadioButton = new ElementsRadioButton();

        extentLogger = report.createTest("Impressive Radio Button Test");

        extentLogger.info("Navigate to demoqa.com");

        extentLogger.info("Click to Elements Button");
        homePage.elements.click();

        extentLogger.info("Click to Radio Button");
        elementsRadioButton.radioButton.click();

        Assert.assertFalse(elementsRadioButton.impressiveRadio.isSelected());

        extentLogger.info("Click to \"Impressive\" Radio button");
        elementsRadioButton.impressiveLabel.click();

        extentLogger.info("Verify 'Impressive' text");
        Assert.assertTrue(elementsRadioButton.impressiveRadio.isSelected());
        Assert.assertEquals(elementsRadioButton.resultText.getText(), "You have selected Impressive");
    }

    /* test4 : Display "You have selected No" when Click to "No"

    -Navigate to https://demoqa.com/
    -Click to Elements
    -Click to Radio Button
    -Click to "No" Radio button
    Verify that "You have selected No" text are Display
     */
    @Test
    public void testNoRadioButton() {
        HomePage homePage = new HomePage();
        ElementsRadioButton elementsRadioButton = new ElementsRadioButton();

        extentLogger = report.createTest("No Radio Button Test");

        extentLogger.info("Navigate to demoqa.com");

        extentLogger.info("Click to Elements Button");
        homePage.elements.click();

        extentLogger.info("Click to Radio Button");
        elementsRadioButton.radioButton.click();

        Assert.assertFalse(elementsRadioButton.noRadio.isSelected());

        extentLogger.info("Click to \"No\" Radio button");
        elementsRadioButton.noLabel.click();

        extentLogger.info("Verify 'No' text");
        Assert.assertTrue(elementsRadioButton.noRadio.isSelected());
        Assert.assertEquals(elementsRadioButton.resultText.getText(), "You have selected No");
    }
}

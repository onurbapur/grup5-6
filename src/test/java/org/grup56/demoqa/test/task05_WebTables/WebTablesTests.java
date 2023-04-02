package org.grup56.demoqa.test.task05_WebTables;

import org.grup56.demoqa.pages.ElementsWebTables;
import org.grup56.demoqa.pages.HomePage;
import org.grup56.demoqa.test.TestBase;
import org.grup56.demoqa.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class WebTablesTests extends TestBase {

    @Test
    public void addANewRow() {
        ElementsWebTables elementsWebTables = new ElementsWebTables();
        HomePage homePage = new HomePage();

        extentLogger = report.createTest("Add a new row");

        extentLogger.info("Go to Web Tables in Elements");
        homePage.elements.click();
        elementsWebTables.webTables.click();

        extentLogger.info("Click to Add Button for new record");
        elementsWebTables.addBtn.click();

        extentLogger.info("Enter the credentials of person");
        extentLogger.info("firstName=mehmet\nlastName=Falanca\nemail=falancaAhmet@falanca.com\nage=40\nsalary=15000\ndepartment=SDET-QA");
        elementsWebTables.enterCredentials("mehmet", "Falanca", "falancaAhmet@falanca.com", "40", "15000", "SDET-QA");

        extentLogger.info("verify add new row by checking email is \"falancaAhmet@falanca.com\"");
        String actualText = elementsWebTables.getTextOfCell(4, 4);
        Assert.assertEquals("falancaAhmet@falanca.com", actualText);

        extentLogger.info("PASSED");
    }

    @Test
    public void deleteARowByMail() {
        ElementsWebTables elementsWebTables = new ElementsWebTables();
        HomePage homePage = new HomePage();

        extentLogger = report.createTest("Delete a row by email");

        extentLogger.info("Go to Web Tables in Elements");
        homePage.elements.click();
        elementsWebTables.webTables.click();

        extentLogger.info("Click Delete Button on a row by email \"cierra@example.com\"");
        String deleteEmail = "cierra@example.com";
        List<String> list = elementsWebTables.getListOfColumn("email");
        Assert.assertTrue(list.contains(deleteEmail));

        String email = "";
        for (int i = 1; i < 11; i++) {
            email = elementsWebTables.getTextOfCell(i, 4);
            if (email.equals(deleteEmail)) {
                elementsWebTables.deleteBtnClick(i);
            }
        }
        BrowserUtils.waitFor(2);

        extentLogger.info("Verify that the row by email \"cierra@example.com\" is deleted");
        list = elementsWebTables.getListOfColumn("email");
        Assert.assertFalse(list.contains(deleteEmail));
        BrowserUtils.waitFor(2);

        extentLogger.info("PASSED");
    }



}

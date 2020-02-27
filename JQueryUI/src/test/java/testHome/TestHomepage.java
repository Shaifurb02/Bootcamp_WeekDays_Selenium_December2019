package testHome;

import common.CommonAPI;
import home.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static home.Homepage.*;

public class TestHomepage extends CommonAPI {

    public static void getInItElements(){
        PageFactory.initElements(driver, Homepage.class);
    }

    @Test(priority = 1)
    public void testResizeElement() throws InterruptedException {
        getInItElements();
        clickResizeButton();
        sleepFor(2);
        resizeElement(xPathResizeFrameLocator, xPathResizeSnippet);
        sleepFor(2);
    }
    @Test(priority = 2)
    public void testDragAndDrop() throws InterruptedException {
        getInItElements();
        clickOnElement(xPathDragAndDropButton);
        iframeHandle(dragAndDropFrame);
        sleepFor(2);
        dragAndDrop(xPathDragFrom, xPathDropTo);
        sleepFor(2);
    }
    @Test (priority = 3)
    public void testIsPopUpDisplayed() throws InterruptedException {
        getInItElements();
        clickOnElement(xPathDialogTab);
        sleepFor(3);
        Assert.assertTrue(driver.findElement(By.xpath(xPathDialogPopUp)).isDisplayed());

    }
    @Test (priority = 4)
    public void testIsPopUpClosed() {
        getInItElements();
        clickOnElement(xPathDialogTab);
        iframeHandle(dialogiFrame);
        clickOnElement("/html[1]/body[1]/div[1]/div[1]");
        driver.switchTo().alert().accept();
    }
    @Test(priority = 5)
    public void testJQueryTitle(){
        getInItElements();
        clickOnElement(xPathJQueryImage);
        if (driver.getTitle().equals("jQuery UI")) {
            System.out.println("Welcome to JQuery homepage");
        } else {
            System.out.println("404 NOT FOUND");
        }
    }
    @Test(priority = 6)
    public void testRightMouseClick() throws InterruptedException {
        getInItElements();
        sleepFor(5);
        rightClickMouse(xPathResizeableButton);
        sleepFor(2);
    }
}

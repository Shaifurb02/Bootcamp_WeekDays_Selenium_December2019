package home.pageObject;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage extends WebAPI {

    @FindBy (how = How.ID, using = "nav-xshop-container")
    public static WebElement isNavBarDisplayedWebElement;
    public static WebElement getIsNavBarDisplayedWebElement() {
        return isNavBarDisplayedWebElement;
    }
    public void isNavBarDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getIsNavBarDisplayedWebElement().isDisplayed();
    }

    @FindBy (how = How.CSS, using = "#a-page > header")
    public static WebElement isHeaderDisplayedWebElement;
    public static WebElement getIsHeaderDisplayedWebElement() {
        return isHeaderDisplayedWebElement;
    }
    public void isHeaderDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getIsHeaderDisplayedWebElement().isDisplayed();
    }

    public void positiveSignIn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//*[@id=\"nav-link-accountList\"]");        //ByXpath
        sleepFor(3);
        typeByXpath("//*[@id=\"ap_email\"]","Shaifur_2102@outlook.com");
        sleepFor(3);
        clickOnElement("//input[@id=\"continue\"]");
        sleepFor(3);
        typeByXpath("//*[@id=\"ap_password\"]","1234abcd");
        sleepFor(3);
        clickOnElement("//*[@id=\"signInSubmit\"]");
        sleepFor(3);
    }

    public void negativeSignIn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//*[@id=\"nav-link-accountList\"]");
        sleepFor(3);
        typeByXpath("//*[@id=\"ap_email\"]","testuser@gmail.com");
        clickOnElement("//input[@id=\"continue\"]");
        sleepFor(3);
    }

    public void searchItem() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//*[@id=\"twotabsearchtextbox\"]");
        typeByXpath("//*[@id=\"twotabsearchtextbox\"]","Phone Charger");
        clickOnElement("//*[@id=\"nav-search\"]/form/div[2]/div/input");
    }

    public void amazonPrime() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//*[@id=\"nav-logo\"]/a[2]");
        sleepFor(3);
        clickOnElement("#prime-header-CTA > span > input");
    }

    public void amazonAlexa() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterDescLine > table > tbody > tr:nth-child(1) > td:nth-child(13) > a");
        sleepFor(3);
    }

    public void amazonInfo() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(1) > ul > li:nth-child(3) > a");
        sleepFor(3);
    }

    public void backToTopButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("navFooterBackToTopText");
        sleepFor(3);
    }

    public void itemCategories() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#nav-hamburger-menu");
        sleepFor(3);
    }


}
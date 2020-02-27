package home;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import home.pageObject.HomePage;

public class TestHomePage extends WebAPI {

    HomePage homePage;

    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void testPositiveSignIn() throws InterruptedException {
        homePage.positiveSignIn();
    }

    @Test
    public void testNegativeSignIn() throws InterruptedException {
        homePage.negativeSignIn();
    }

    @Test
    public void testSearchItem() throws InterruptedException {
        homePage.searchItem();
    }

    @Test
    public void testAmazonPrime() throws InterruptedException {
        homePage.amazonPrime();
    }

    @Test
    public void testAmazonAlexa() throws InterruptedException {
        homePage.amazonAlexa();
    }

    @Test
    public void testAmazonInfo() throws InterruptedException {
        homePage.amazonInfo();
    }

    @Test
    public void testBackToTopButton() throws InterruptedException {
        homePage.backToTopButton();
    }

    @Test
    public void testItemCategories() throws InterruptedException {
        homePage.itemCategories();
    }

    @Test
    public void testIsNavBarDisplayed() {
        homePage.isNavBarDisplayed();
    }

    @Test
    public void testIsHeaderDisplayed() {
        homePage.isHeaderDisplayed();
    }

}
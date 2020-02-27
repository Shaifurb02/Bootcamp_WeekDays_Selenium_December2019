package TestHome;

import common.WebAPI;
import home.pageObject.GoogleHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestGoogleHomePage extends WebAPI {


    @Test (priority = 1)
    public void testSearchBox() throws InterruptedException {
        GoogleHomePage home = PageFactory.initElements(driver, GoogleHomePage.class);
        driver.manage().window().maximize();
        sleepFor(2);
        home.checkSearchBox();
    }

    public static void getInItElements(){ PageFactory.initElements(driver,GoogleHomePage.class); }

    @Test(priority = 1)
    public static void testSearchFromDB() throws Exception {
        getInItElements();
        sleepFor(1);
    }
    @Test(priority = 2)
    public static void testSearchFromExcel() throws IOException, InterruptedException {
        getInItElements();
        sleepFor(1);
    }

//    @Test (priority = 2)
//    public void testMenuButton() throws InterruptedException {
//        GoogleHomePage home = PageFactory.initElements(driver, GoogleHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(5);
//        home.checkMenuButton();
//
//    }
//
//    @Test (priority = 3)
//    public void testSupportButton () throws InterruptedException {
//        GoogleHomePage home = PageFactory.initElements(driver, GoogleHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(5);
//        home.checkOnSupport();
//    }
//
//    @Test (priority = 4)
//    public void testShoppingCartButton () throws InterruptedException {
//        GoogleHomePage home = PageFactory.initElements(driver, GoogleHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(5);
//        home.checkShoppingCart();
//    }
//
//    @Test (priority = 5)
//    public void testAccount () throws InterruptedException {
//        GoogleHomePage home = PageFactory.initElements(driver, GoogleHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(5);
//        home.checkOnAccount();
//    }
//    @Test (priority = 6)
//    public void testAccountMenu () throws InterruptedException {
//        GoogleHomePage home = PageFactory.initElements(driver, GoogleHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(4);
//        home.checkOnAccountMenu();
//    }
//
//    @Test (priority = 7)
//    public void testAccountMenuSignIn () throws InterruptedException {
//        GoogleHomePage home = PageFactory.initElements(driver, GoogleHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(2);
//        home.checkOnAccountMenuSignIn();
//    }
//
//    @Test (priority = 8)
//    public void testClickOnBusinessButton () throws InterruptedException {
//        GoogleHomePage home = PageFactory.initElements(driver, GoogleHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(2);
//        home.checkOnBusinessButton();
//    }
//


}

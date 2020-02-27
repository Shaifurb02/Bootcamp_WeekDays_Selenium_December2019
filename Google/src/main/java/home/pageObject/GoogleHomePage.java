package home.pageObject;

import databases.ConnectToSqlDB;
import home.webElement.WebElementGoogleHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.DataReader;

import java.io.IOException;


public class GoogleHomePage extends WebElementGoogleHomePage {

    @FindBy(how = How.XPATH, using = WebElementGoogleHomePage.SearchBox)
    WebElement clickOnSearchBox;

    public void checkSearchBox() throws InterruptedException {
        clickOnSearchBox.click();
        sleepFor(3);
        clickOnSearchBox.sendKeys("Apple iPhones", Keys.ENTER);

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();

        clickOnSearchBox.click();
    }

        @FindBy(xpath = searchBox)public static WebElement googleSearchBox;
        public static WebElement getGoogleSearchBox(){return googleSearchBox;}
        public static void searchDataBase() throws Exception {
            for (int i = 0; i< ConnectToSqlDB.readDataBase("search table","search").size(); i++) {
                getGoogleSearchBox().sendKeys(ConnectToSqlDB.readDataBase("search table","search").get(i), Keys.ENTER);
                sleepFor(2);
                navigateBack();
                sleepFor(2);
            }
        }

        public static void searchFromExcel() throws IOException, InterruptedException {
            String[][] mat = DataReader.fileReader1("/Users/sbhuiyan/AllMyPntWorkFiles/programs/IdeaProjects/BootCamp_WeekDays_Selenium_2020/Google/src/main/Files/Book2.xlsx", 0);
            for (int i = 1; i < mat.length; i++) {
                System.out.print(mat[i][0] + " ");
                driver.findElement(By.xpath(searchBox)).sendKeys(mat[i][0],Keys.ENTER);
                sleepFor(2);
                navigateBack();
                sleepFor(2);
            }
        }







    }
}
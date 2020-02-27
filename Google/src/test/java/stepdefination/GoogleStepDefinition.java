
package stepdefination;

import TestHome.TestGoogleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static home.webElement.WebElementGoogleHomePage.SearchBox;

public class GoogleStepDefinition extends TestGoogleHomePage {

    @Given("I am at {string}")
    public void i_am_at(String string) {
        getLocalDriver("Mac","chrome");
        driver.get(string);
        driver.manage().window().maximize();
    }

    @Given("I search {string}")
    public void i_search(String string) {
        driver.findElement(By.xpath(SearchBox)).sendKeys(string, Keys.ENTER);
    }

    @Then("I close Browser")
    public void i_close_Browser() {
        driver.quit();
    }

    @Given("I search value {string}")
    public void i_search_value(String string) {
        String searchBox;
        driver.findElement(By.xpath(SearchBox)).sendKeys(string, Keys.ENTER);
        driver.close();
    }

    @Given("I am Searching from DataBase")
    public void iAmSearchingFromDataBase() throws Exception {
        getInItElements();
    }


}
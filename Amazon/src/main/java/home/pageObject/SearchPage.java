package home.pageObject;

import common.WebAPI;
import home.xLSDB.ConnectingToXLSDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.util.List;

public class SearchPage extends WebAPI {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public WebElement searchBox;
    public WebElement getSearchBox() {
        return searchBox;
    }


    @FindBy(how = How.CSS, using = "#nav-search > form > div.nav-right > div > input")
    public WebElement searchButton;
    public WebElement getSearchButton() {
        return searchButton;
    }
     public void clickOnSearchButton() {
        getSearchButton().click();
    }

    @FindBy(css = "#twotabsearchtextbox")
    WebElement searchInputWebElement;
    public void searchFor(String value) {
        getSearchBox().sendKeys(value);
    }
    public void searchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnSearchButton();
        searchFor("Wallets");
        clickOnSearchButton();
        navigateBack();
    }
    @FindBy(css = "#nav-search > form > div.nav-right > div > input")
    WebElement searchNewInputWebElement;
    public WebElement getSearchInputWebElement(){return searchInputWebElement;}
    public WebElement getSearchNewInputWebElement(){return searchNewInputWebElement;}

    public void searchItemsAndSubmitButtonFromExcelFile()throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = ConnectingToXLSDB.getItemsListFromExcel();
        clickOnSearchButton();
        getSearchInputWebElement().sendKeys(list.get(1), Keys.ENTER);
        navigateBack();
        clearInput();
        clickOnSearchButton();
        for(int i=2; i<list.size(); i++) {
            getSearchNewInputWebElement().sendKeys(list.get(i), Keys.ENTER);
            navigateBack();
            clickOnSearchButton();
            clearInput();
        }
    }
    public void searchItemsAndSubmitButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = ConnectingToXLSDB.insertDataIntoDB();
        for (int i = 0; i < list.size(); i++) {
            searchFor(list.get(i));
            clickOnSearchButton();
            navigateBack();
            clearInput();
        }
    }
    public void clearInput() {
        getSearchBox().clear();
    }
    public void searchItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> itemList = ConnectingToXLSDB.getItemValue();
        for (String st : itemList) {
            searchFor(st);
            clickOnSearchButton();
            navigateBack();
            clearInput();
        }
    }

}


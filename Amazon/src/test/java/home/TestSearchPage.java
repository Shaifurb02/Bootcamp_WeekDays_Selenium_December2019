package home;

import common.WebAPI;
import home.getDataXLS.Features;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import home.pageObject.SearchPage;

import java.io.IOException;

public class TestSearchPage extends WebAPI {

    SearchPage searchPage;

    Features features = PageFactory.initElements(driver, Features.class);

    @BeforeMethod
    public void initElements() {
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    @Test
    public void testSearchBox() {
        searchPage.searchBox();
    }

    @Test
    @Ignore
    public void testSearchBoxFromDB() throws Exception {
        searchPage.searchItemsAndSubmitButton();
    }

    @Test
    @Ignore
    public void testSearchBoxFromDataSource() throws Exception {
        searchPage.searchItems();
    }

    @Test
    @Ignore
    public void testKeyWord() throws IOException, InterruptedException {
        features.selectFeatures(driver);
    }

    @Test
    @Ignore
    public void search() throws Exception {
        searchPage.searchItemsAndSubmitButtonFromExcelFile();
    }
}
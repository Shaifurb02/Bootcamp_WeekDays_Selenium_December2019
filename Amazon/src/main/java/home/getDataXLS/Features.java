package home.getDataXLS;

import common.WebAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;

public class Features extends WebAPI {

    DataReader dataRead = new DataReader();

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException {
        String path = System.getProperty("user.dir")+"../Amazon/excelReadWrite/Amazon.xls";
        String [] data = dataRead.fileReader2(path,0);
        return data;
    }
    public void signIn(WebDriver driver1){}

    public void registration(){
        typeByCss("testuser", "email");
        typeByCss("1234abcd", "password");
    }

    public void search(WebDriver driver1){}

    public void select(String featureName, WebDriver driver1)throws InterruptedException{
        switch(featureName){
            case "signIn":
                signIn(driver1);
                break;
            case "registration  ":
                registration();
                break;
            case "search":
                search(driver1);
                break;
            default:
                throw new InvalidArgumentException("Invalid choice");
        }
    }

    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Features itemsToBeSearched = new Features();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=1; i<testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}

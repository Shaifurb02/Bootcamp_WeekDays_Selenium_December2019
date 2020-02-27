package home.xLSDB;

import common.WebAPI;
import databases.ConnectToSqlDB;
import utility.DataReader;

import java.util.ArrayList;
import java.util.List;

public class ConnectingToXLSDB extends WebAPI {

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static List<String> insertDataIntoDB(){
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"Search Items","List of Items");
        return list;
    }

    public static List<String> getItemsListFromExcel() throws Exception {

        String path = "/Users/sbhuiyan/AllMyPntWorkFiles/programs/IdeaProjects/BootCamp_WeekDays_Selenium_2020/Amazon/excelReadWrite/Amazon.xls";
        String[] myStringArray = DataReader.fileReader2(path, 0);
        for(int i=1;i<myStringArray.length; i++)
            System.out.print(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
        }
        return list;
    }

    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Shoes");
        itemsList.add("Watches");
        itemsList.add("Belts");
        itemsList.add("Polos");
        itemsList.add("Button Downs");
        itemsList.add("Seiko Watches");
        itemsList.add("Coffee machine");
        itemsList.add("Gloves");
        itemsList.add("Flash Lights");
        itemsList.add("Cameras");
        itemsList.add("Dash Cam");

        return itemsList;
    }
}
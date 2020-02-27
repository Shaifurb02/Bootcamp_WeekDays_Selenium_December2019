package databases;

import java.util.ArrayList;
import java.util.List;

public class SourceData {

    public static List<String> searchElements(){

        List<String> elements=new ArrayList<String>();

        elements.add("Wallets");
        elements.add("Belts");
        elements.add("Sun Glasses");
        elements.add("Watches");

        return elements;
    }

    public static int[] name={1,4,5,6};

    public static void main(String[] args) throws Exception {

        System.out.println(searchElements());
        System.out.println(ConnectToSqlDB.readDataBase("Search Items","Item List"));
    }

}

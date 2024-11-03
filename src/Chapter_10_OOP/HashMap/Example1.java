package Chapter_10_OOP.HashMap;

import java.util.HashMap;

public class Example1 {
    public static void main(String[] args) {

        HashMap<String,String> countries = new HashMap<String,String>();
        countries.put("Gambia","Banjul");
        countries.put("Senegal","Dakar");
        countries.put("Mali","Bamako");
        countries.put("Ghana","Accra");

       // System.out.println(countries.remove("Gambia"));
        //System.out.println(countries.get("Gambia"));
        //countries.clear();
        //countries.replace("Gambia","Serrekunda");
        // System.out.println(countries.size());
        System.out.println(countries.containsKey("Gambia"));
        //System.out.println(countries);

        for(String key : countries.keySet()){
            System.out.println(key+": "+countries.get(key));
        }
    }
}

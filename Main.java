import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
public class Main {


    public static void main(String[] args) throws Exception{
        Country[] countryList = new Country[3];
        String a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter details:");
        a = br.readLine();
        CountryBO c1 = new CountryBO();
        countryList[0] = c1.createCountry(a);
        System.out.println("Printing country name: " + countryList[0].getName());
        System.out.println(" Enter details:");
        a = br.readLine();
        countryList[1] = c1.createCountry(a);
        c1.displaySpecificCountryDetails(countryList, "India", 2);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
public class Main {

    public static void main(String[] args) throws Exception{
    	
    	Country[] countryList = new Country[10];
    	
    	System.out.println("Menu:\n"
    			+ "Type any number between 1 and 6\n"
    			+ "1)Create a new country\n"
    			+ "2)Display details of a specific country\n"
    			+ "3)Display the details of all countries\n"
    			+ "4)Display the ISD codes of all countries\n"
    			+ "5)Update ISD code of a specific country\n"
    			+ "6)Exit");
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int choice, cntinc = 0;
    	String a,opt,SearchCountry,NewISDCode;
    	CountryBO c1 = new CountryBO();
    	
    	do 
    	{
    		System.out.println("Enter your choice");
    		choice = Integer.parseInt(br.readLine());
    		switch (choice) {
    		
    		case 1: 
    			System.out.println("Enter Country Details");
    			a = br.readLine();
    			countryList[cntinc] = c1.createCountry(a);
    			cntinc++;
    			break;
    			
    		case 2:
    			System.out.println("Enter the name of the country to be searched");
    			SearchCountry = br.readLine();		
    			c1.displaySpecificCountryDetails(countryList, SearchCountry, cntinc);
    			break;  
    		
    		case 3:
    			System.out.println("Details of all countries");
    			c1.displayAllCountryDetails(countryList, cntinc);
    			break;
    			
    		case 4:
    			System.out.println("ISD codes of all countries");
    			c1.displayAllCountryNameAndIsdCode(countryList, cntinc);
    			break;
    		
    		case 5:
    			System.out.println("Enter the name of the country for which the isd code needs to be updated");
    			SearchCountry = br.readLine();	
    			System.out.println("Enter the new ISD code");
    			NewISDCode = br.readLine();
    			c1.updateIsdCodeOfSpecificCountry(countryList, SearchCountry, NewISDCode, cntinc);
    			break;
    			
    		default:
    			System.out.println("Invalid input");
    			break;		
    		}

    		System.out.println("Do you want to continue? Type Yes / No");
    		opt = br.readLine();
    		
    		
    	} while (opt.equals("Yes"));
    	
        
        
    }
}

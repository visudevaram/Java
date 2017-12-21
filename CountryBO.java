class CountryBO{

    public Country createCountry(String data){
        String array1[] = data.split(",");
        Country cnt1 = new Country(array1[0],array1[1], array1[2]);
        //System.out.println("Assignment done!");
        return cnt1;
    }

    public void displaySpecificCountryDetails(Country[] countryList, String countryName, int countryCount) throws Exception{
        int i=0, j = 0;
        while(countryCount > 0) {
            String cntName = countryList[i].getName();
            if (cntName.equals(countryName)){
            	System.out.println(countryList[i].toString(1));
                j = 1;
                break;
                }
            else {
                countryCount--;
                //System.out.println("In else part");
            }
            i++;
        }
        if(j==0){
            System.out.println("Country by name " + countryName + " is not found");
        }
     
    }
    
    public void displayAllCountryDetails(Country[] countryList, int countryCount) {    	
    	for(int ind=0;ind<countryCount;ind++) {
    		System.out.println(countryList[ind].toString(1));
   	 }
    }
    public void displayAllCountryNameAndIsdCode(Country[] countryList, int countryCount) {
    	for(int ind=0;ind<countryCount;ind++) {
    		System.out.println(countryList[ind].toString(2));
   	 }
    	
    }
    
    public void updateIsdCodeOfSpecificCountry(Country[] countryList, String countryName, String isdCode, int countryCount) {
    	 int i=0, j = 0;
         while(countryCount > 0) {
             String cntName = countryList[i].getName();
             if (cntName.equals(countryName)){
             	countryList[i].setIsdCode(isdCode);
                 j = 1;
                 break;
                 }
             else {
                 countryCount--;
                 //System.out.println("In else part");
             }
             i++;
         }
         if(j==0){
             System.out.println("Country by name " + countryName + " is not found");
         }
    	
    }
    
    
   
}

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
            System.out.println("Country names in array:-"+ cntName + "-");
            System.out.println("Country names in array:-"+ countryName + "-");
            if (cntName.equals(countryName)){
            	String pri = countryList[i].toString();
                System.out.println("Found country" + countryList[i]);
                j = 1;
                break;
                }
            else {
                countryCount--;
                System.out.println("In else part");
            }
            i++;
        }
        if(j==0){
            System.out.println("No country found");
        }
        
    }
    public String toString() {
    	Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
    	gson.toJson(myObject);
    }
}

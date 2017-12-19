class CountryBO{

    public Country createCountry(String data){
        String array1[] = data.split(",");
        Country cnt1 = new Country(array1[0],array1[1], array1[2]);
        //System.out.println("Assignment done!");
        return cnt1;
    }

    public void displaySpecificCountryDetails(Country[] countryList, String countryName, int countryCount){
        int i=0, j = 0;
        while(countryCount > 0) {
            String cntName = countryList[i].getName();
            System.out.println("Country names in array:-"+ cntName + "-");
            System.out.println("Country names in array:-"+ countryName + "-");
            if (cntName.equals(countryName)){
                System.out.println("Found country");
                j = 1;
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

}}
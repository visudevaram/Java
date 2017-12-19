class Country{
    private String name;
    private String countryCode;
    private String isdCode;
    int i = 0;

    public Country(String name, String countryCode, String isdCode){
        this.name = name;
        this.countryCode = countryCode;
        this.isdCode = isdCode;
    }

    public String getName() {
        return this.name;
    }

    public String getCountryCode(){
        return this.countryCode;
    }

    public String getIsdCode(){
        return this.isdCode;
    }

    public void setContry(String a, String b, String c){
        this.name = a;
        this.countryCode = b;
        this.isdCode = c;
    }
}


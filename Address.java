public class Address {

    String number;
    String street;
    String city;
    String country;

    public Address(String number, String street, String city, String country) {
        
        this.number = number;
        this.street = street;
        this.city = city;
        this.country = country;

    }

    public String getNumber(){
        return this.number;
    }
    public String getStreet(){
        return this.street;
    }
    public String getCity(){
        return this.city;
    }
    public String getCountry(){
        return this.country;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public void getStreet(String street){
        this.street = street;
    }
    public void getCity(String city){
        this.city = city;
    }
    public void getCountry(String country){
        this.country = country;
    }

}
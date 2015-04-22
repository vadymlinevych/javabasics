package Task_04;

public class Address {
    public String country;
    public String city;
    public String street;

    @Override
    public String toString() {
        return "Country: " + country + "\n" +
                "City: " + city + "\n" +
                "Street: " + street + "\n";
    }
}

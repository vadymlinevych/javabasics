package Task_04;

import java.util.Arrays;

public class Person {

    public String name;
    public String surname;
    public String[] phones;
    public String[] sites;
    public Address address;

    @Override
    public String toString() {
        return  "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Phones: " + Arrays.toString(phones) + "\n" +
                "Sites: " + Arrays.toString(sites) + "\n" +
                "Address: " + address.toString() + "\n";
    }
}
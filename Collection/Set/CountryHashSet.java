import java.util.HashSet;
import java.util.Iterator;

public class CountryHashSet {

    // Instance variable
    HashSet<String> H1 = new HashSet<String>();

    // Method to add country
    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    // Method to search country
    public String getCountry(String countryName) {

        Iterator<String> iterator = H1.iterator();

        while (iterator.hasNext()) {
            String country = iterator.next();

            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        CountryHashSet obj = new CountryHashSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");
        obj.saveCountryNames("Canada");

        System.out.println("Countries in HashSet:");
        System.out.println(obj.H1);

        System.out.println();

        System.out.println("Search Result:");
        System.out.println("India : " + obj.getCountry("India"));
        System.out.println("Japan : " + obj.getCountry("Japan"));
        System.out.println("China : " + obj.getCountry("China"));
    }
}

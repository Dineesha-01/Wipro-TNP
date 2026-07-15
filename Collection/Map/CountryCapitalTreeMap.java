import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class CountryCapitalTreeMap {

    // Instance variable
    TreeMap<String, String> M1 = new TreeMap<String, String>();

    // 1. Save Country and Capital
    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // 2. Get Capital from Country
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // 3. Get Country from Capital
    public String getCountry(String capitalName) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }

        return null;
    }

    // 4. Create another TreeMap with Capital as Key and Country as Value
    public TreeMap<String, String> getReverseMap() {

        TreeMap<String, String> M2 = new TreeMap<String, String>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    // 5. Create an ArrayList of Country Names
    public ArrayList<String> getCountryList() {

        ArrayList<String> list = new ArrayList<String>();

        for (String country : M1.keySet()) {
            list.add(country);
        }

        return list;
    }

    public static void main(String[] args) {

        CountryCapitalTreeMap obj = new CountryCapitalTreeMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");
        obj.saveCountryCapital("Australia", "Canberra");

        System.out.println("TreeMap M1:");
        System.out.println(obj.M1);

        System.out.println();

        System.out.println("Capital of India : " + obj.getCapital("India"));
        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));

        System.out.println();

        System.out.println("Reverse TreeMap (Capital -> Country):");
        System.out.println(obj.getReverseMap());

        System.out.println();

        System.out.println("Country List:");
        System.out.println(obj.getCountryList());
    }
}

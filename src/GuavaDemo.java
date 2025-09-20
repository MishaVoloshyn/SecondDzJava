import com.google.common.collect.ImmutableList;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class GuavaDemo {
    public static void main(String[] args) {
        ImmutableList<String> fruits = ImmutableList.of("Apple", "Banana", "Orange");
        System.out.println("Immutable list: " + fruits);

        Multimap<String, String> citiesByCountry = HashMultimap.create();
        citiesByCountry.put("USA", "New York");
        citiesByCountry.put("USA", "Chicago");
        citiesByCountry.put("France", "Paris");

        System.out.println("Cities by country: " + citiesByCountry);
    }
}

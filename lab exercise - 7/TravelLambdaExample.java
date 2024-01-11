import java.util.ArrayList;
import java.util.List;

class Destination {
    private String name;
    private boolean popular;

    public Destination(String name, boolean popular) {
        this.name = name;
        this.popular = popular;
    }

    public String getName() {
        return name;
    }

    public boolean isPopular() {
        return popular;
    }
}

public class TravelLambdaExample {
    public static void main(String[] args) {
        List<Destination> destinations = new ArrayList<>();
        destinations.add(new Destination("Beach City", true));
        destinations.add(new Destination("Mountain Valley", false));
        destinations.add(new Destination("Historical Town", true));
        destinations.add(new Destination("Adventure Peak", false));

        // Using lambda expression to filter popular destinations
        List<Destination> popularDestinations = filterDestinations(destinations, d -> d.isPopular());

        // Displaying the result
        System.out.println("Popular Destinations:");
        popularDestinations.forEach(d -> System.out.println(d.getName()));
    }

    // Lambda expression for filtering destinations
    private static List<Destination> filterDestinations(List<Destination> destinations, DestinationFilter filter) {
        List<Destination> result = new ArrayList<>();
        for (Destination destination : destinations) {
            if (filter.test(destination)) {
                result.add(destination);
            }
        }
        return result;
    }

    // Functional interface for destination filtering
    @FunctionalInterface
    interface DestinationFilter {
        boolean test(Destination destination);
    }
}

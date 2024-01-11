import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

// Define a class to represent a travel destination
class Destination {
    private String name;
    private String description;

    public Destination(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

public class TravelAndTourismCollection {

    public static void main(String[] args) {
        // ArrayList to store a list of travel destinations
        List<Destination> destinationList = new ArrayList<>();
        destinationList.add(new Destination("Paris", "The City of Love"));
        destinationList.add(new Destination("Tokyo", "Vibrant metropolis with a mix of modern and traditional culture"));
        destinationList.add(new Destination("New York", "The Big Apple"));

        System.out.println("List of Travel Destinations:");
        for (Destination destination : destinationList) {
            System.out.println(destination);
        }
        System.out.println();

        // HashSet to store a set of unique travel activities
        Set<String> activitySet = new HashSet<>();
        activitySet.add("Sightseeing");
        activitySet.add("Shopping");
        activitySet.add("Cultural experiences");
        activitySet.add("Adventure sports");

        System.out.println("Set of Travel Activities:");
        for (String activity : activitySet) {
            System.out.println(activity);
        }
        System.out.println();

        // HashMap to store information about each travel destination
        Map<String, String> destinationInfoMap = new HashMap<>();
        destinationInfoMap.put("Paris", "Eiffel Tower, Louvre Museum, Champs-Élysées");
        destinationInfoMap.put("Tokyo", "Tokyo Tower, Shibuya Crossing, Meiji Shrine");
        destinationInfoMap.put("New York", "Times Square, Central Park, Statue of Liberty");

        System.out.println("Information about Travel Destinations:");
        for (Map.Entry<String, String> entry : destinationInfoMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

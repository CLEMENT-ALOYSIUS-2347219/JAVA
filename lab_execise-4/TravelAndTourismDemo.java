public class TravelAndTourismDemo {
    public static void main(String[] args) {
        TravelPackage adventurePackage = new AdventurePackage("Extreme Adventure", 7, 1500.0);
        TravelPackage culturalPackage = new CulturalPackage("Cultural Exploration", 5, 1200.0);
        TravelPackage relaxationPackage = new RelaxationPackage("Peaceful Retreat", 3, 800.0);

        // Display details and calculate costs
        adventurePackage.displayDetails();
        System.out.println("Total Cost: Rs" + adventurePackage.calculateCost());

        culturalPackage.displayDetails();
        System.out.println("Total Cost: Rs" + culturalPackage.calculateCost());

        relaxationPackage.displayDetails();
        System.out.println("Total Cost: Rs" + relaxationPackage.calculateCost());
    }
}
// Abstract class representing a general travel package
abstract class TravelPackage {
    private String packageName;
    private double price;

    public TravelPackage(String packageName, double price) {
        this.packageName = packageName;
        this.price = price;
    }

    public String getPackageName() {
        return packageName;
    }

    public double getPrice() {
        return price;
    }

    // Abstract method to display package details
    public abstract void displayPackageDetails();
}

// Concrete class representing a basic travel package
class BasicTravelPackage extends TravelPackage {
    private String hotel;

    public BasicTravelPackage(String packageName, double price, String hotel) {
        super(packageName, price);
        this.hotel = hotel;
    }

    // Override the abstract method to display package details
    @Override
    public void displayPackageDetails() {
        System.out.println("Basic Travel Package: " + getPackageName());
        System.out.println("Price: Rs" + getPrice());
        System.out.println("Hotel: " + hotel);
    }
}

// Final class representing a premium travel package (no subclassing allowed)
final class PremiumTravelPackage extends TravelPackage {
    private String hotel;
    private String additionalService;

    public PremiumTravelPackage(String packageName, double price, String hotel, String additionalService) {
        super(packageName, price);
        this.hotel = hotel;
        this.additionalService = additionalService;
    }

    // Override the abstract method to display package details
    @Override
    public void displayPackageDetails() {
        System.out.println("Premium Travel Package: " + getPackageName());
        System.out.println("Price: Rs" + getPrice());
        System.out.println("Hotel: " + hotel);
        System.out.println("Additional Service: " + additionalService);
    }
}

// Main class to test the travel packages
public class TravelMain {
    public static void main(String[] args) {
        BasicTravelPackage basicPackage = new BasicTravelPackage("City Tour", 500.0, "Comfort Inn");
        PremiumTravelPackage premiumPackage = new PremiumTravelPackage("Luxury Escape", 1000.0, "Five Star Resort", "Spa and Wellness");

        System.out.println("Details of Basic Travel Package:");
        basicPackage.displayPackageDetails();

        System.out.println("\nDetails of Premium Travel Package:");
        premiumPackage.displayPackageDetails();
    }
}

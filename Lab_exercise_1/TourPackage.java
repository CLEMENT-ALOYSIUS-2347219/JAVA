public class TourPackage {
    // Data members (attributes)
    private String packageName;
    private double packageCost;
    private int durationInDays;

    // Default constructor
    public TourPackage() {
        this.packageName = "Generic Package";
        this.packageCost = 0.0;
        this.durationInDays = 0;
    }

    // Parameterized constructor
    public TourPackage(String packageName, double packageCost, int durationInDays) {
        this.packageName = packageName;
        this.packageCost = packageCost;
        this.durationInDays = durationInDays;
    }

    // Constructor overloading
    public TourPackage(String packageName, double packageCost) {
        this.packageName = packageName;
        this.packageCost = packageCost;
        this.durationInDays = 0;
    }

    // Constructor overloading
    public TourPackage(String packageName, int durationInDays) {
        this.packageName = packageName;
        this.packageCost = 0.0;
        this.durationInDays = durationInDays;
    }

    // Method to display package details
    public void displayPackageDetails() {
        System.out.println("Package Name: " + packageName);
        System.out.println("Package Cost: Rs" + packageCost);
        System.out.println("Duration: " + durationInDays + " days");
    }

    // Method overloading
    public void displayPackageDetails(boolean includeDetails) {
        if (includeDetails) {
            displayPackageDetails();
        } else {
            System.out.println("Package Name: " + packageName);
        }
    }

    // Method overloading
    public void displayPackageDetails(String additionalInfo) {
        displayPackageDetails();
        System.out.println("Additional Information: " + additionalInfo);
    }

    // Method overloading
    public void displayPackageDetails(boolean includeDetails, String additionalInfo) {
        if (includeDetails) {
            displayPackageDetails(additionalInfo);
        } else {
            System.out.println("Package Name: " + packageName);
            System.out.println("Additional Information: " + additionalInfo);
        }
    }

    public static void main(String[] args) {
        // Create tour package objects using different constructors
        TourPackage package1 = new TourPackage("Beach Vacation", 15000, 7);
        TourPackage package2 = new TourPackage("Mountain Adventure", 20000, 10);
        TourPackage package3 = new TourPackage("City Tour", 5);

        // Display package details
        System.out.println("Package 1:");
        package1.displayPackageDetails(true, "All-inclusive");
        System.out.println("\nPackage 2:");
        package2.displayPackageDetails();
        System.out.println("\nPackage 3:");
        package3.displayPackageDetails(true);
    }
}

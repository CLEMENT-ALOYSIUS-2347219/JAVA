// Package declaration for the travel domain
package travel;

// Interface representing a generic tour package
interface TourPackage {
    void displayDetails();
}

// Abstract class representing a travel agency
abstract class TravelAgency implements TourPackage {
    // Data members
    protected String agencyName;
    protected int numberOfEmployees;
    protected double revenue;

    // Default Constructor
    public TravelAgency() {
        this.agencyName = "Default Agency";
        this.numberOfEmployees = 0;
        this.revenue = 0.0;
    }

    // Parameterized Constructor
    public TravelAgency(String name, int employees, double revenue) {
        this.agencyName = name;
        this.numberOfEmployees = employees;
        this.revenue = revenue;
    }

    // Method Overloading
    public void promoteTourPackage() {
        System.out.println("Promoting a standard tour package");
    }

    public void promoteTourPackage(String destination) {
        System.out.println("Promoting a tour package to " + destination);
    }

    public void promoteTourPackage(String destination, int days) {
        System.out.println("Promoting a " + days + "-day tour package to " + destination);
    }

    // Abstract method to be implemented by subclasses
    public abstract void specialPromotion();

    // Method to display agency information
    public void displayAgencyInfo() {
        System.out.println("Agency Name: " + agencyName);
        System.out.println("Number of Employees: " + numberOfEmployees);
        System.out.println("Revenue: $" + revenue);
    }
}

// Subclass representing a specific type of travel agency
class AdventureTravelAgency extends TravelAgency {
    // Constructor Overloading
    public AdventureTravelAgency() {
        super(); // Calling the superclass default constructor
    }

    public AdventureTravelAgency(String name, int employees, double revenue) {
        super(name, employees, revenue); // Calling the superclass parameterized constructor
    }

    // Overriding the abstract method
    @Override
    public void specialPromotion() {
        System.out.println("Exciting adventure packages on special promotion!");
    }

    // Implementing interface method
    @Override
    public void displayDetails() {
        System.out.println("Details of Adventure Tour Package");
    }
}

// Main class to demonstrate the program
public class TravelAndTourismMain {
    public static void main(String[] args) {
        // Creating an instance of AdventureTravelAgency using default constructor
        AdventureTravelAgency adventureAgency = new AdventureTravelAgency();
        adventureAgency.promoteTourPackage("Mountain Trek");
        adventureAgency.specialPromotion();
        adventureAgency.displayAgencyInfo();

        // Creating an instance of AdventureTravelAgency using parameterized constructor
        AdventureTravelAgency customAgency = new AdventureTravelAgency("Extreme Explorers", 20, 500000.0);
        customAgency.promoteTourPackage("Deep Sea Diving");
        customAgency.specialPromotion();
        customAgency.displayAgencyInfo();

        // Using interface method
        customAgency.displayDetails();
    }
}

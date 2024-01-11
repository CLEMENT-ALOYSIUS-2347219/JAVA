// Generic class representing a TravelPackage
class TravelPackage<T> {
    private T packageDetails;

    public TravelPackage(T packageDetails) {
        this.packageDetails = packageDetails;
    }

    public T getPackageDetails() {
        return packageDetails;
    }

    public void setPackageDetails(T packageDetails) {
        this.packageDetails = packageDetails;
    }

    @Override
    public String toString() {
        return "TravelPackage{" +
                "packageDetails=" + packageDetails +
                '}';
    }
}

// Generic interface representing a TravelService
interface TravelService<T> {
    void bookPackage(TravelPackage<T> travelPackage);
}

// Generic class implementing the TravelService interface
class TravelAgency<T> implements TravelService<T> {
    @Override
    public void bookPackage(TravelPackage<T> travelPackage) {
        // Simulate booking logic
        System.out.println("Booking the following package: " + travelPackage);
    }
}

// Main class to demonstrate the use of generics in the travel and tourism domain
public class TravelDemo {
    public static void main(String[] args) {
        // Creating a TravelPackage for a cruise
        TravelPackage<String> cruisePackage = new TravelPackage<>("Luxury Cruise to the Caribbean");

        // Creating a TravelPackage for a guided tour
        TravelPackage<Integer> guidedTourPackage = new TravelPackage<>(7); // 7 days guided tour

        // Creating a TravelAgency for cruises
        TravelAgency<String> cruiseAgency = new TravelAgency<>();

        // Booking the cruise package
        cruiseAgency.bookPackage(cruisePackage);

        // Creating a TravelAgency for guided tours
        TravelAgency<Integer> tourAgency = new TravelAgency<>();

        // Booking the guided tour package
        tourAgency.bookPackage(guidedTourPackage);
    }
}

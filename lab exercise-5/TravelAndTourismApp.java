import java.util.concurrent.*;

// Class representing a travel agency
class TravelAgency {
    private BlockingQueue<String> bookingRequests;

    public TravelAgency(BlockingQueue<String> bookingRequests) {
        this.bookingRequests = bookingRequests;
    }

    public void processBookingRequest(String customerName) {
        System.out.println("Processing booking request for " + customerName);

        // Simulate processing time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Booking request processed for " + customerName);
    }
}

// Class representing a customer
class Tourist extends Thread {
    private String name;
    private TravelAgency travelAgency;

    public Tourist(String name, TravelAgency travelAgency) {
        this.name = name;
        this.travelAgency = travelAgency;
    }

    @Override
    public void run() {
        System.out.println(name + " is planning a trip.");

        // Simulate time to plan the trip
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Place a booking request with the travel agency
        travelAgency.processBookingRequest(name + "'s trip");
    }
}

// Main class representing the travel and tourism application
public class TravelAndTourismApp {
    public static void main(String[] args) {
        BlockingQueue<String> bookingRequests = new LinkedBlockingQueue<>();
        TravelAgency travelAgency = new TravelAgency(bookingRequests);

        // Create a travel agency thread
        Thread travelAgencyThread = new Thread(() -> {
            try {
                while (true) {
                    String bookingRequest = bookingRequests.take();
                    if (bookingRequest.equals("exit")) {
                        System.out.println("Travel agency received exit signal. Exiting.");
                        break;
                    }
                    travelAgency.processBookingRequest(bookingRequest);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        travelAgencyThread.start();

        // Simulate multiple tourists planning trips
        for (int i = 1; i <= 5; i++) {
            Tourist tourist = new Tourist("Tourist " + i, travelAgency);
            tourist.start();
            // Simulate time between tourists
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Place a booking request for each tourist
            try {
                bookingRequests.put("Booking request for Tourist " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Signal travel agency to exit
        try {
            bookingRequests.put("exit");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wait for the travel agency to finish
        try {
            travelAgencyThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

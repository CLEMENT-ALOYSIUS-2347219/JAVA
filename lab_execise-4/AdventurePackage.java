class AdventurePackage implements TravelPackage {
    private String packageName;
    private int duration;
    private double cost;

    public AdventurePackage(String packageName, int duration, double cost) {
        this.packageName = packageName;
        this.duration = duration;
        this.cost = cost;
    }

    @Override
    public void displayDetails() {
        System.out.println("Adventure Package: " + packageName);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Cost: $" + cost);
    }

    @Override
    public double calculateCost() {
        return cost;
    }
}

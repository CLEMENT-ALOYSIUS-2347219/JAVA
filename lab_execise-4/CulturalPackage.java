class CulturalPackage implements TravelPackage {
    private String packageName;
    private int duration;
    private double cost;

    public CulturalPackage(String packageName, int duration, double cost) {
        this.packageName = packageName;
        this.duration = duration;
        this.cost = cost;
    }

    @Override
    public void displayDetails() {
        System.out.println("Cultural Package: " + packageName);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Cost: $" + cost);
    }

    @Override
    public double calculateCost() {
        return cost;
    }
}


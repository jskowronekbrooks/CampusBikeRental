/** A station that rents Bike objects. */
public class RentalStation {
    private static final double HOURLY_RATE = 8.00;
    private static int totalRentals = 0;
    private String name;

    public RentalStation(String name) {
        this.name = name;
    }

    public void rentBike(Bike bike) {
        if (bike.isAvailable()) {
            bike.rent();
            totalRentals++;
            System.out.println(name + " rented "  + 
                    bike.getModel() + " (Bike #" + bike.getId() + ")");
        } else {
            System.out.println("Bike #" + bike.getId() + " is already rented.");
        }
    }

    public void returnBike(Bike bike) {
        bike.returnBike();
        System.out.println("Bike #" + bike.getId() + " returned.");
    }

    public static double calculateCost(int hours) {
        return hours * HOURLY_RATE;
    }

    public static int getTotalRentals() {
        return totalRentals;
    }

    public String getName() {
        return name;
    }
}

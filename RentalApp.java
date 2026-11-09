/** Client program for the campus bike rental system. */
public class RentalApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Campus Bike Rental System!");
        
        RentalStation station1 = new RentalStation("North Station");
        RentalStation station2 = new RentalStation("South Station");

        Bike trek = new Bike(101, "Trek");
        Bike giant = new Bike(102, "Giant");
        Bike offroad = new Bike(103, "Offroad");

        station1.rentBike(trek);

        station1.rentBike(trek);

        station2.rentBike(offroad);

        station2.returnBike(trek);
        station2.rentBike(trek);

        double total = RentalStation.calculateCost(3);
        System.out.println();
        System.out.print("3-hour rental cost: ");
        System.out.printf("$%.2f%n", total); // formats total to two decimal places

        int rentals = RentalStation.getTotalRentals();
        System.out.println("Total successful rentals: " + rentals);
    }
}

/*
PART D — Written Responses

1. Why is totalRentals static, but name is not?
Answer: totalRentals tracks the number of rentals that have been made from the RentalStation
class, but name is specific to each RentalStation. 

2. What would happen if totalRentals were not static?
Answer: Every time a rental was made, there would need to be a function that updates each instance's
totalRentals. This would be a nightmare to expand dynamically, as you would need to call this manually
for every rental station object that you create.

3. When rentBike(Bike bike) is called, is a new Bike object created? Explain.
Answer: No, this only changes the isAvailable status of the bike that was passed in to rentBike. The
bike object was created earlier, this function only modifies it.

4. Why is HOURLY_RATE declared final?
Answer: This is a value that never changes, and never has the need to change. It is constant for every 
instance of RentalStation.
*/

/** Client program for the campus bike rental system. */
public class RentalApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Campus Bike Rental System!");
        
        // TODO 1: Create two RentalStation objects.
        RentalStation station1 = new RentalStation("North Station");
        RentalStation station2 = new RentalStation("SouthStation");

        // TODO 2: Create at least three Bike objects.
        Bike trek = new Bike(101, "Trek");
        Bike giant = new Bike(102, "Giant");
        Bike offroad = new Bike(103, "Offroad");

        // TODO 3: Rent a bike from the first station.
        station1.rentBike(trek);

        // TODO 4: Attempt to rent the same bike again.
        station1.rentBike(trek);

        // TODO 5: Rent a different bike from the second station.
        station2.rentBike(offroad);

        // TODO 6: Return the first bike and rent it again.
        station2.returnBike(trek);
        station2.rentBike(trek);

        // TODO 7: Print the cost of a three-hour rental.
        double total = RentalStation.calculateCost(3);
        System.out.println();
        System.out.println("3-hour rental cost: $" + total);

        // TODO 8: Print the total successful rentals using
        int rentals = RentalStation.getTotalRentals();
        System.out.println("Total sucessful rentals: " + rentals);
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
Answer: No, this only changes the isAvailable status of the biket that was passed in to rentBike. The
bike object was created earlier, this function only modifies it.

4. Why is HOURLY_RATE declared final?
Answer: This is a value that never changes, and never has the need to change. It is constant for every 
instance of RentalStation.
*/

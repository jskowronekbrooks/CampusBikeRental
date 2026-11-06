# Campus Bike Rental System

**AP Computer Science A — Unit 3: Classes and Objects**  

## Your mission

Your school is introducing a small bike rental program. Write a Java application that manages bikes, handles rentals and returns, calculates rental costs, and tracks the number of successful rentals across multiple stations.

You will work in three files:

- `Bike.java` — represents an individual bike.
- `RentalStation.java` — manages rentals and shared rental statistics.
- `RentalApp.java` — the client program containing `main`.

## Learning goals

- Define classes with private instance variables, constructors, and methods.
- Use a `static` field for data shared across all instances.
- Declare and use a `static final` constant.
- Pass an existing object as a method parameter and change its state.
- Create and use objects from a client program.

## Part A — Bike.java

Complete the provided class stub. Each bike has a private ID, model name, and availability status. The constructor should mark new bikes as available. Implement getters, `rent()`, and `returnBike()`.

## Part B — RentalStation.java

Complete the provided class stub. Each station has its own name. All stations share one rental counter.

1. Set `HOURLY_RATE` to `8.00` and initialize `totalRentals` to zero.
2. Implement `rentBike(Bike bike)`: if the bike is available, mark it rented and increment the shared counter; otherwise, print a message and do **not** increment the counter.
3. Implement `returnBike(Bike bike)` to make the specified bike available again.
4. Implement `calculateCost(int hours)` to return the cost at the hourly rate.
5. Implement the static `getTotalRentals()` method.

Use the `Bike` object's public methods; do not directly access its private fields.

## Part C — RentalApp.java

In `main`, write a client program that:

1. Creates two rental stations.
2. Creates at least three different bikes.
3. Rents one bike from the first station.
4. Tries to rent that same bike again (the second attempt should fail).
5. Rents a different bike from the second station.
6. Returns the first bike, then rents it again.
7. Prints the cost of a three-hour rental.
8. Prints the total number of successful rentals using `RentalStation.getTotalRentals()`.

### Example output

Your exact formatting can differ, but the results should match:

```text
North Station rented Trek (Bike #101)
Bike #101 is already rented.
South Station rented Giant (Bike #102)
Bike #101 returned.
North Station rented Trek (Bike #101)

3-hour rental cost: $24.00
Total successful rentals: 3
```

## Part D — Written responses

Answer these questions in a comment at the bottom of `RentalApp.java`:

1. Why is `totalRentals` static, but `name` is not?
2. What would happen if `totalRentals` were not static?
3. When `rentBike(Bike bike)` is called, is a new `Bike` object created? Explain.
4. Why is `HOURLY_RATE` declared `final`?

## Run in VS Code

1. Open the **CampusBikeRental** folder in VS Code with the Java Extension Pack installed.
2. Complete the TODOs in all three files.
3. Run `RentalApp.java` using the Java Run option, or open the integrated terminal and run:

```bash
javac Bike.java RentalStation.java RentalApp.java
java RentalApp
```

The starter files contain intentional TODOs. They may compile before they behave correctly; compiling is not the same as completing the assignment.

## Before you submit

- [ ] All three Java files compile and run.
- [ ] A second rental attempt on an unavailable bike does not count.
- [ ] Rentals at either station contribute to the same counter.
- [ ] Returning and re-renting a bike works.
- [ ] A three-hour rental costs $24.00.
- [ ] Written questions are answered in `RentalApp.java`.

## Optional challenge

Modify `Bike` so that IDs are assigned automatically using a `static int nextId` field instead of being supplied to the constructor.

## Submit

After commiting your code, push your commits to GitHub and then copy the repo link and submit it in onBrooks.
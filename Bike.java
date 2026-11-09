/** Represents one bike in the campus rental system. */
public class Bike {
    private int id;
    private String model;
    private boolean isAvailable;

    public Bike(int id, String model) {
        this.id = id;
        this.model = model;
        isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent() {
        isAvailable = false;
    }

    public void returnBike() {
        isAvailable = true;
    }
}

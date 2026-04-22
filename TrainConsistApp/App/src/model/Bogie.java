package model;

/**
 * Represents a discrete Train Bogie containing both a name and a specific seating capacity.
 * Structured cleanly to demonstrate Separation of Data and Logic and custom Object collections.
 */
public class Bogie {
    private String name;
    private int capacity;

    /**
     * Initializes a Bogie with a name and seating capacity.
     * 
     * @param name     Name of the bogie classification
     * @param capacity Number of available seats
     */
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    /**
     * Gets the bogie's classification name.
     * 
     * @return Bogie name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the total capacity.
     * 
     * @return Number of seats
     */
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

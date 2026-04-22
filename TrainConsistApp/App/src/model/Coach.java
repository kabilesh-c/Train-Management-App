package model;

/**
 * Represents the base concept of a train coach/bogie.
 * Provides abstraction for different types of coaches in the train consist.
 */
public abstract class Coach {
    private String coachNumber;
    private String type;

    /**
     * Constructor to initialize coach properties.
     * 
     * @param coachNumber Unique identifier for the coach
     * @param type        Type of the coach
     */
    public Coach(String coachNumber, String type) {
        this.coachNumber = coachNumber;
        this.type = type;
    }

    public String getCoachNumber() {
        return coachNumber;
    }

    public String getType() {
        return type;
    }

    /**
     * Display basic information about the coach.
     * Subclasses can override this to provide more specific details.
     */
    public void display() {
        System.out.println(type + " - Coach No: " + coachNumber);
    }
}

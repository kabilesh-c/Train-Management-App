package model;

/**
 * Represents a General Unreserved Coach in the train consist.
 * A specific type of coach meant for general seating without reserved berths.
 */
public class GeneralCoach extends Coach {

    /**
     * Constructs a basic General Coach.
     * 
     * @param coachNumber Unique identifier for the coach
     */
    public GeneralCoach(String coachNumber) {
        super(coachNumber, "General Class (UR)");
    }

    /**
     * Display general coach specific information.
     */
    @Override
    public void display() {
        System.out.println(getType() + " [" + getCoachNumber() + "] - Unreserved Seating");
    }
}

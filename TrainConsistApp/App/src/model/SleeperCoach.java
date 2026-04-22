package model;

/**
 * Represents a Sleeper Coach in the train consist.
 * Extends the basic Coach model to represent a tangible, real-world sleeper bogey.
 */
public class SleeperCoach extends Coach {
    private int berthCapacity;

    /**
     * Initializes a Sleeper Coach.
     * 
     * @param coachNumber   Unique identifier for the coach
     * @param berthCapacity Total number of berths in this sleeper coach
     */
    public SleeperCoach(String coachNumber, int berthCapacity) {
        super(coachNumber, "Sleeper Class (SL)");
        this.berthCapacity = berthCapacity;
    }

    /**
     * Retrieves the berth capacity for this specific coach.
     * 
     * @return the number of berths
     */
    public int getBerthCapacity() {
        return berthCapacity;
    }

    /**
     * Overrides the display method to also show the capacity.
     */
    @Override
    public void display() {
        System.out.println(getType() + " [" + getCoachNumber() + "] - Berths: " + berthCapacity);
    }
}

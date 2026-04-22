package model;

/**
 * Represents an Air-Conditioned Coach in the train consist.
 * A specific type of coach with varying tiers (1AC, 2AC, 3AC).
 */
public class ACCoach extends Coach {
    private String tier;

    /**
     * Constructs an AC Coach with a specific tier level.
     * 
     * @param coachNumber Unique identifier for the coach
     * @param tier        The tier of the AC coach (e.g., "3AC", "2AC")
     */
    public ACCoach(String coachNumber, String tier) {
        super(coachNumber, "AC Class (" + tier + ")");
        this.tier = tier;
    }

    /**
     * Gets the AC tier.
     * 
     * @return tier designation
     */
    public String getTier() {
        return tier;
    }

    /**
     * Overrides display to show AC specific information.
     */
    @Override
    public void display() {
        System.out.println(getType() + " [" + getCoachNumber() + "] - Air Conditioned " + tier);
    }
}

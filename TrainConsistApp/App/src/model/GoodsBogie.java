package model;

/**
 * Represents a Goods Bogie used for cargo transport.
 * Contains properties for both physical type and the cargo it carries,
 * enabling safety validation logic tests based on real-world constraints.
 */
public class GoodsBogie {
    private String type;
    private String cargo;

    /**
     * Initializes a Goods Bogie.
     * 
     * @param type  The physical type of the bogie (e.g., Cylindrical, Flatbed)
     * @param cargo The cargo being loaded (e.g., Petroleum, Steel)
     */
    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " carrying " + cargo;
    }
}

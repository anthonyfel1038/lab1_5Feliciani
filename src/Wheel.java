/**
 * Project: lab1_5Feliciani
 * Purpose Details: Define the wheel and its properties with constructors, getters, and setters.
 * Course: CMPSC 221
 * Author: Anthony Feliciani
 * Date Developed: October 25, 2026
 * Last Date Changed: October 25, 2026
 * Revision: 1.0
 */
public class Wheel {
    private int diameterInches;
    private String tireType;

    public Wheel(int diameterInches, String tireType) {
        this.diameterInches = diameterInches;
        this.tireType = tireType;
    }

    public int getDiameterInches() {
        return diameterInches;
    }

    public void setDiameterInches(int diameterInches) {
        this.diameterInches = diameterInches;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

}

/**
 * Project: lab1_5Feliciani
 * Purpose Details: Define the brake and its properties with constructors, getters, and setters.
 * Course: CMPSC 221
 * Author: Anthony Feliciani
 * Date Developed: October 25, 2026
 * Last Date Changed: October 25, 2026
 * Revision: 1.0
 */
public class Brake {
    private String frontType;
    private String rearType;
    private boolean abs;

    public Brake(String frontType, String rearType, boolean abs) {
        this.frontType = frontType;
        this.rearType = rearType;
        this.abs = abs;
    }

    public String getFrontType() {
        return frontType;
    }

    public void setFrontType(String frontType) {
        this.frontType = frontType;
    }

    public String getRearType() {
        return rearType;
    }

    public void setRearType(String rearType) {
        this.rearType = rearType;
    }

    public boolean getAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

}

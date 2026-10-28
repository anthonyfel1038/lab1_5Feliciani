/**
 * Project: lab1_5Feliciani
 * Purpose Details: Define the transmission and its properties with constructors, getters, and setters.
 * Course: CMPSC 221
 * Author: Anthony Feliciani
 * Date Developed: October 25, 2026
 * Last Date Changed: October 25, 2026
 * Revision: 1.0
 */
public class Transmission {
    private String type;
    private int gears;

    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

}

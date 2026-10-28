/**
 * Project: lab1_5Feliciani
 * Purpose Details: Define the engine and its properties with constructors, getters, and setters.
 * Course: CMPSC 221
 * Author: Anthony Feliciani
 * Date Developed: October 25, 2026
 * Last Date Changed: October 25, 2026
 * Revision: 1.0
 */
public class Engine {
    private int displacementCc;
    private int cylinders;
    private double horsepower;

    public Engine(int displacementCc, int cylinders, double horsepower) {
        this.displacementCc = displacementCc;
        this.cylinders = cylinders;
        this.horsepower = horsepower;
    }

    public int getDisplacementCc() {
        return displacementCc;
    }

    public void setDisplacementCc(int displacementCc) {
        this.displacementCc = displacementCc;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public double getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(double horsepower) {
        this.horsepower = horsepower;
    }

}

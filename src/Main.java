/**
 * Project: lab1_5Feliciani
 * Purpose Details: Create three motorcycles and print all instance values using getter methods.
 * Course: CMPSC 221
 * Author: Anthony Feliciani
 * Date Developed: October 25, 2026
 * Last Date Changed: October 25, 2026
 * Revision: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Motorcycle[] motorcycles = {
            new Motorcycle("Kawasaki", "Ninja 500", 2026, "Black",
                new Engine(451, 2, 51.0), new Transmission("Manual", 6),
                new Wheel(17, "Sport"), new Wheel(17, "Sport"),
                new Brake("Disc", "Disc", true)),
            new Motorcycle("Yamaha", "YZF-R3", 2025, "Blue",
                new Engine(321, 2, 41.0), new Transmission("Manual", 6),
                new Wheel(17, "Sport"), new Wheel(17, "Sport"),
                new Brake("Disc", "Disc", true)),
            new Motorcycle("Honda", "CBR650R", 2025, "Red",
                new Engine(649, 4, 94.0), new Transmission("Manual", 6),
                new Wheel(17, "Sport"), new Wheel(17, "Sport"),
                new Brake("Disc", "Disc", true))
        };

        for (int i = 0; i < motorcycles.length; i++) {
            printMotorcycle(motorcycles[i], i + 1);
        }
    }

    private static void printMotorcycle(Motorcycle motorcycle, int number) {
        System.out.println("========== MOTORCYCLE " + number + " ==========");
        System.out.println("Make: " + motorcycle.getMake());
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Year: " + motorcycle.getYear());
        System.out.println("Color: " + motorcycle.getColor());

        Engine engine = motorcycle.getEngine();
        System.out.println("\nENGINE DETAILS");
        System.out.println("Displacement: " + engine.getDisplacementCc() + "cc");
        System.out.println("Cylinders: " + engine.getCylinders());
        System.out.println("Horsepower (approx.): " + engine.getHorsepower());

        Transmission transmission = motorcycle.getTransmission();
        System.out.println("\nTRANSMISSION DETAILS");
        System.out.println("Type: " + transmission.getType());
        System.out.println("Gears: " + transmission.getGears());

        System.out.println("\nWHEEL DETAILS");
        System.out.println("Front Wheel: " + motorcycle.getFrontWheel().getDiameterInches() + " inches");
        System.out.println("Front Tire Type: " + motorcycle.getFrontWheel().getTireType());
        System.out.println("Rear Wheel: " + motorcycle.getRearWheel().getDiameterInches() + " inches");
        System.out.println("Rear Tire Type: " + motorcycle.getRearWheel().getTireType());

        Brake brake = motorcycle.getBrake();
        System.out.println("\nBRAKE DETAILS");
        System.out.println("Front Brake: " + brake.getFrontType());
        System.out.println("Rear Brake: " + brake.getRearType());
        System.out.println("ABS: " + (brake.getAbs() ? "Yes" : "No"));
        System.out.println("==================================\n");
    }
}

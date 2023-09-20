package session2.exercises.nails;

import session2.exercises.nails.FingerNail;
import session2.exercises.nails.MetalNail;


public class NailTest {
    public static void main(String[] args) {
        // Create a finger nail
        FingerNail fingerNail = new FingerNail(2.5, 0.3, "Red");

        // Create a metal nail
        MetalNail metalNail = new MetalNail(3.0, 0.08);

        // Print properties of both nails
        System.out.println("Finger Nail:");
        System.out.println("Length: " + fingerNail.getLength());
        System.out.println("Width: " + fingerNail.getWidth());
        System.out.println("Color: " + fingerNail.getColor());

        fingerNail.setColor("blue");
    // fingernail after modifying an attribute
        System.out.println("Finger Nail after modifying color:");
        System.out.println("Length: " + fingerNail.getLength());
        System.out.println("Width: " + fingerNail.getWidth());
        System.out.println("Color: " + fingerNail.getColor());

        System.out.println("\nMetal Nail:");
        System.out.println("Length: " + metalNail.getLength());
        System.out.println("Thickness: " + metalNail.getThickness());
    }
}


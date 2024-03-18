/**
 * <Kasus 2 : Polimorphism
 * Author   : Nobby Dharma Khaulid
 * NIM      : 231524020
 * Tanggal  : 18 Maret 2023
 * Tujuan   : Represents a cylinder, a type of geometric shape. Inherits from the abstract class Shape.
 * File     : Cylinder.java.java
 */

public class Cylinder extends Shape {
    /** Radius of the cylinder's base. */
    private double radius;
    /** Height of the cylinder. */
    private double height;

    //--------------------------------------------------------//
    // Constructs a cylinder with given radius and height.
    //--------------------------------------------------------//
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    //-------------------------------------------------------//
    // Calculates the surface area of the cylinder.
    //-------------------------------------------------------//
    @Override
    public double area() {
        return Math.PI * radius * radius * height;
    }

    //-------------------------------------------------------//
    // Returns a string representation of the cylinder.
    //-------------------------------------------------------//
    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}

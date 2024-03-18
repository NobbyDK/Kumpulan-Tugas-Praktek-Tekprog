/**
 * <Kasus 2 : Polimorphism
 * Author   : Nobby Dharma Khaulid
 * NIM      : 231524020
 * Tanggal  : 16 Maret 2023
 * Tujuan   : Represents a rectangle, a type of geometric shape. Inherits from the abstract class Shape.
 * File     : Rectangle.java
 */
 

public class Rectangle extends Shape {
    /** Length of the rectangle. */
    private double length;
    /** Width of the rectangle. */
    private double width;

    /**
     * Constructs a rectangle with given length and width.
     */
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle.
     */
    @Override
    public double area() {
        return length * width;
    }

    /**
     * Returns a string representation of the rectangle.
     */
    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}

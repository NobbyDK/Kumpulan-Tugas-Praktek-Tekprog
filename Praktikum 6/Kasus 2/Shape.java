/**
 * <Kasus 2 : Polimorphism
 * Author   : Nobby Dharma Khaulid
 * NIM      : 231524020
 * Tanggal  : 16 Maret 2023
 * Tujuan   : Abstract class representing a geometric shape.
 * File     : Shape.java
 */

public abstract class Shape {
    // Name of the shape. 
    public String shapeName;

    //------------------------------------------------------//
    // Constructs a shape with a given name.
    //------------------------------------------------------//
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    //------------------------------------------------------//
    // Abstract method to calculate the area of the shape.
    //------------------------------------------------------//
    public abstract double area();

    //------------------------------------------------------//
    // Returns a string representation of the shape.
    //------------------------------------------------------//
    @Override
    public String toString() {
        return "Shape Name: " + shapeName;
    }
}


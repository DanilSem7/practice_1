package ru.mirea.ikbo2019.pr1;
import java.lang.*;

public class TestBall {
    public static void main(String[] args) {

        Ball c1 = new Ball(10, "blue"); // Use 3rd constructor
        System.out.println(c1.toString());
        System.out.println("Radius is " + c1.getRadius()
                        + " Color is " + c1.getColor()
                        + " Diameter is " + c1.getDiameter());

        Ball c2 = new Ball(12); // Use 2nd constructor
        System.out.println("Radius is " + c2.getRadius()
                + " Color is " + c2.getColor()
                + " Diameter is " + c2.getDiameter());

        Ball c3 = new Ball(); // Use 1st constructor
        System.out.println("Radius is " + c3.getRadius()
                + " Color is " + c3.getColor()
                + " Diameter is " + c3.getDiameter());
    }
}

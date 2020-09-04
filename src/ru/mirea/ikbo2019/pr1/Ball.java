package ru.mirea.ikbo2019.pr1;
import java.lang.*;

public class Ball {
    private int radius;
    private String color;

    public Ball() {
        radius = 1;
        color = "red";
    }
    public Ball(int r) {
        radius = r;
        color = "red";
    }
    public Ball(int r, String c) {
        radius = r;
        color = c;
    }

    public String toString(){
        return this.radius+", color "+this.color;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getDiameter() {
        return radius*2;
    }
}

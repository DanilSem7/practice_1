package ru.mirea.ikbo2019.pr1;
import java.lang.*;

public class Book {
    private int pages;
    private String color;
    private int chapters;

    public Book() {
        pages = 30;
        color = "black";
    }
    public Book(int p) {
        pages = p;
        color = "red";
    }
    public Book(int p, String c) {
        pages = p;
        color = c;
    }

    public String toString(){
        return this.pages+", color "+this.color;
    }

    public double getPages() {
        return pages;
    }
    public String getColor() {
        return color;
    }

    public int getChapters() {
        return pages/6;
    }
}

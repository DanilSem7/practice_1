package ru.mirea.ikbo2019.pr1;
import java.lang.*;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book(12, "blue"); // Use 3rd constructor
        System.out.println(b1.toString());
        System.out.println("Pages: " + b1.getPages()
                + " Color is " + b1.getColor()
                + " Chapters: " + b1.getChapters());

        Book b2 = new Book(36); // Use 2nd constructor
        System.out.println("Pages: " + b2.getPages()
                + " Color is " + b2.getColor()
                + " Chapters: " + b2.getChapters());

        Book b3 = new Book(); // Use 1st constructor
        System.out.println("Pages: " + b3.getPages()
                + " Color is " + b3.getColor()
                + " Chapters: " + b3.getChapters());
    }
    }


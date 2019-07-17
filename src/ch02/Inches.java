package ch02;

public class Inches {
    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in cubic mile");
    }
}

/*

There are 254358061056000 cubic inches in cubic mile

*/
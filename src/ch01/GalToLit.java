/* GalToLit.java
    The program converts gallons to liters.
 */
package ch01;

public class GalToLit {
    public static void main(String[] args) {
        double gallons;
        double liters;

        gallons = 10;

        liters = gallons * 3.7854;

        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}

/* Output

10.0 gallons is 37.854 liters.

*/
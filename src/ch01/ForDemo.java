package ch01;

public class ForDemo {
    public static void main(String[] args) {
        int count;

        for (count = 0; count < 5; count = count+1)
            System.out.println("This is count: " + count);

        System.out.println("Done!");
    }
}

/* Output

This is count: 0
This is count: 1
This is count: 2
This is count: 3
This is count: 4
Done!

*/
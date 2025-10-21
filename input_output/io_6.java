// CODE:-

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Create Scanner object to read input from console
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a boolean value (true/false): ");
        boolean flag = sc.nextBoolean(); // read boolean input

        System.out.println("You entered: " + flag);

        // Close the scanner
        sc.close();
    }
}

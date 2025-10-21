// CODE:-

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Create Scanner object to read input from console
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double num = sc.nextDouble(); // read double input

        System.out.println("You entered: " + num);

        // Close the scanner
        sc.close();
    }
}

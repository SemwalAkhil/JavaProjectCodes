// CODE:-

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Create Scanner object to read input from console
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt(); // read integer input

        System.out.println("You entered: " + num);

        // Close the scanner
        sc.close();
    }
}

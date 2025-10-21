// CODE:-

import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            // Create BufferedReader object to read input from console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter a string: ");
            String input = br.readLine(); // read a line of text

            System.out.println("You entered: " + input);

            // Close the BufferedReader
            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

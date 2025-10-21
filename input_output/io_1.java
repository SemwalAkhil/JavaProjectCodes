// CODE:- 

import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            // Create InputStreamReader object to read from console
            InputStreamReader isr = new InputStreamReader(System.in);
            System.out.print("Enter a character: ");

            // Read a single character
            char ch = (char) isr.read();

            System.out.println("You entered: " + ch);

            // Close the stream
            isr.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

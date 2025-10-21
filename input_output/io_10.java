// CODE:-

// Q10. Get all characters from the file, count number of lines, words, characters

import java.io.*;

class Main {
    public static void main(String[] args) {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            // Create BufferedReader to read file line by line
            BufferedReader br = new BufferedReader(new FileReader("input.txt")); // make sure file exists
            String line;

            System.out.println("File content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line); // display the line
                lineCount++; // count lines
                charCount += line.length(); // count characters in the line
                String[] words = line.trim().split("\\s+"); // split by spaces
                if (!line.trim().isEmpty()) {
                    wordCount += words.length; // count words
                }
            }

            // Display counts
            System.out.println("\nTotal Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters: " + charCount);

            br.close(); // close the reader

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("IO Error: " + e);
        }
    }
}

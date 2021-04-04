package p07_SumOfCharacters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number of characters: ");
        int number = Integer.parseInt(reader.readLine());
        int sum = 0;

        System.out.println("Enter " + number + " chars.");
        for (int i = 0; i < number; i++) {
            System.out.print("Enter a character: ");
            char character = reader.readLine().charAt(0);
            sum += character;
        }

        System.out.printf("The sum is: %d.", sum);
    }
}
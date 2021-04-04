package p08_TriplesOfLatinLetters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number to loop in the alphabet: ");
        int number = Integer.parseInt(reader.readLine());

        System.out.println("Output:");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                for (int k = 0; k < number; k++) {

                    char first = (char) ('a' + i);
                    char second = (char) ('a' + j);
                    char third = (char) ('a' + k);

                    System.out.printf("%s%s%s\n", first, second, third);
                }
            }
        }
    }
}

package p01_ConvertMetersToKilometers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter meters to convert to kilometers: ");
        int meters = Integer.parseInt(reader.readLine());

        double km = (double) meters / 1000;

        System.out.printf("Output: %.2f km%n", km);

        reader.close();
    }
}

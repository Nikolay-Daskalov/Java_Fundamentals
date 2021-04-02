package p03_TownInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a town: ");
        String town = reader.readLine();

        System.out.print("Enter a population: ");
        int population = Integer.parseInt(reader.readLine());

        System.out.print("Enter a area (square km): ");
        int area = Integer.parseInt(reader.readLine());

        System.out.printf("Town %s has population of %d and area %d square km.%n", town, population, area);
    }
}
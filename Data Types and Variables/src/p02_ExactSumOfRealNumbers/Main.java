package p02_ExactSumOfRealNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number to count: ");
        int numberToCount = Integer.parseInt(reader.readLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <= numberToCount; i++) {
            System.out.print("Enter a number add to the sum: ");
            BigDecimal number = new BigDecimal(reader.readLine());
            sum = sum.add(number);
        }

        System.out.println("Sum is: " + sum);

        reader.close();
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter how many times to take input: ");
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        System.out.print("The numbers in reverse order: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first array: ");
        int[] firstArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.print("Enter second array: ");
        int[] secondArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        boolean ifAreEqual = true;
        int index = -1, sum = 0;

        if (firstArray.length != secondArray.length) {
            System.out.println("Enter equal size arrays next time!");
            return;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                ifAreEqual = false;
                index = i;
                break;
            } else {
                sum += firstArray[i];
            }
        }

        if (ifAreEqual) {
            System.out.printf("Arrays are identical. Sum of the numbers is: %d.%n", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.%n", index);
        }
    }
}
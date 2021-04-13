import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            nums.add(Integer.parseInt(numbers[i]));
        }

        for (int i = 0; i < nums.size(); i++) {
            int first = nums.get(i);
            int last = nums.get(nums.size() - 1);

            if (i != nums.size() - 1) {
                nums.remove(i);
                nums.remove(nums.size() - 1);
                nums.add(i, first + last);
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
    }
}
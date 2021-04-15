import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Random random = new Random();

        for (int i = 0; i < input.size(); i++) {
            int num = random.nextInt(input.size());
            String swap = input.get(num);
            input.set(num, input.get(i));
            input.set(i, swap);
        }

        for (int i = 0; i < input.size(); i++) {
            System.out.println(input.get(i));
        }
    }
}
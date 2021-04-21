import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingPlace = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            switch (input[0]) {
                case "register":
                    if (parkingPlace.containsKey(input[1])) {
                        System.out.println("ERROR: already registered with plate number " + parkingPlace.get(input[1]));
                    } else {
                        parkingPlace.put(input[1], input[2]);
                        System.out.printf("%s registered %s successfully%n", input[1], parkingPlace.get(input[1]));
                    }
                    break;
                case "unregister":
                    if (parkingPlace.containsKey(input[1])) {
                        System.out.println(input[1] + " unregistered successfully");
                        parkingPlace.remove(input[1]);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", input[1]);
                    }
                    break;
            }
        }
        parkingPlace.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
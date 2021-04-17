import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = Integer.parseInt(scanner.nextLine());

        String[] phrases = new String[]{
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};

        String[] events = new String[]{
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};

        String[] authors = new String[]{
                "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"};

        String[] cities = new String[]{
                "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"};

        for (int i = 0; i < n; i++) {
            Random random = new Random();
            System.out.println(phrases[random.nextInt(phrases.length)] + " " +
                    events[random.nextInt(events.length)] + " " +
                    authors[random.nextInt(authors.length)] + " - " +
                    cities[random.nextInt(cities.length)]);
        }
    }
}
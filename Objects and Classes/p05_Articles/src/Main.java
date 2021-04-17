import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        run(scanner);
    }

    private static void run(Scanner scanner) {
        System.out.print("Enter the information about an article: ");
        String[] arct = scanner.nextLine().split(", ");

        Article article = new Article(arct[0], arct[1], arct[2]);

        System.out.print("Enter the number of times to make changes in the article: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a command: ");
            String[] input = scanner.nextLine().split(":\\s");

            switch (input[0]) {
                case "Edit":
                    article.Edit(input[1]);
                    break;
                case "ChangeAuthor":
                    article.ChangeAuthor(input[1]);
                    break;
                case "Rename":
                    article.Rename(input[1]);
                    break;
            }
        }

        System.out.println(article.toString());
    }
}

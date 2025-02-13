import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Run Bai1");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Your name is: ");
        String name = scanner.nextLine();

        System.out.printf("Your score is: ");
        int score = scanner.nextInt();

        System.out.println(name + " has score " + score);
        scanner.close();
    }
}

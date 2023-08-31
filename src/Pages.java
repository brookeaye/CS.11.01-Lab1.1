import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age.");
        int yourAge = scanner.nextInt();
        System.out.println("You should read " + (100 - yourAge) + "  pages of a book before giving up on it.");
    }
}

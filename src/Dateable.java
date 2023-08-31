import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner ageScanner = new Scanner(System.in);
        System.out.println("Enter your age bozo");
        int age = ageScanner.nextInt();
        System.out.println("You should date someone who is at least " + (7 + age/2) + " years old");
        System.out.println("Though I also believe that you should have the freedom to choose. So do whatever you want, but also don't be a perv. Ok.");
    }
}

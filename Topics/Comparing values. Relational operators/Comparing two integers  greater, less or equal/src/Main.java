import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers from the user
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num1 > num2 ? '>' : num1 < num2 ? '<' : '=');

    }
}
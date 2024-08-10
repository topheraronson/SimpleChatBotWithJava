import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();

        boolean onePositive = input1 > 0 && input2 <= 0 && input3 <= 0;
        boolean twoPositive = input1 <= 0 && input2 > 0 && input3 <= 0;
        boolean threePositive = input1 <= 0 && input2 <= 0 && input3 > 0;

        boolean onlyOnePositive = onePositive || twoPositive || threePositive;

        System.out.println(onlyOnePositive);
    }
}
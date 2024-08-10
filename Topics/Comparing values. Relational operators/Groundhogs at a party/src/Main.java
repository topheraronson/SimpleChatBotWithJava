import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfReeses = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean isSuccessfulWeekend = isWeekend && numberOfReeses >= 15 && numberOfReeses <= 25;
        boolean isSuccessfulWeekday = !isWeekend && numberOfReeses >= 10 && numberOfReeses <= 20;

        System.out.println(isSuccessfulWeekend || isSuccessfulWeekday);
    }
}
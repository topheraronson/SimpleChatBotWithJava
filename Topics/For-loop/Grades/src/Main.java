import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfGrades = scanner.nextInt();

        int numberOfAs = 0;
        int numberOfBs = 0;
        int numberOfCs = 0;
        int numberOfDs = 0;

        for (int i = 0; i < numberOfGrades; i++) {
            String grade = scanner.next();

            switch (grade) {
                case "A" -> numberOfAs++;
                case "B" -> numberOfBs++;
                case "C" -> numberOfCs++;
                default -> numberOfDs++;
            }
        }

        System.out.printf("%d %d %d %d", numberOfDs, numberOfCs, numberOfBs, numberOfAs);

    }
}
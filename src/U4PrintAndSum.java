import java.util.Scanner;

public class U4PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = scanner.nextInt();
        int sum = 0;

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.printf("\nSum: %d", sum);
    }
}
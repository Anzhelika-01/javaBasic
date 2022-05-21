import java.util.Scanner;

public class U6StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;

         for (int i = num; i > 0; i /= 10){
            int fact = 1;
            int digit = i % 10;
            for (int j = digit; j > 1; j--){
                fact *= j;
            }
            sum += fact;
        }

        if (sum == num){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
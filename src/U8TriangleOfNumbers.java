import java.util.Scanner;

public class U8TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = i; j > 0; j--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
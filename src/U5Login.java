import java.util.Scanner;

public class U5Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String correctPassword = "";
        int counter = 1;

        for (int i = username.length() - 1; i >= 0; i--){
            correctPassword += username.charAt(i);
        }
        String password = scanner.nextLine();
        while (!password.equals(correctPassword) && counter != 4){
            System.out.println("Incorrect password. Try again.");
            password = scanner.nextLine();
            counter++;
        }
        if (counter == 4){
            System.out.printf("User %s blocked!", username);
        }
        else {
            System.out.printf("User %s logged in.", username);
        }
    }
}
import java.util.Scanner;

public class U11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int headset = 0;
        int mouse = 0;
        int keyboard = 0;
        int display = 0;

        if (lostGamesCount >= 12){
            display = lostGamesCount / 12;
            keyboard = lostGamesCount / 6;
            mouse = lostGamesCount / 3;
            headset = lostGamesCount / 2;
        }
        else if (lostGamesCount >= 6) {
            keyboard = lostGamesCount / 6;
            mouse = lostGamesCount / 3;
            headset = lostGamesCount / 2;
        }
        else if (lostGamesCount >= 3){
            mouse = lostGamesCount / 3;
            headset = lostGamesCount / 2;
        }
        else if(lostGamesCount >= 2){
            headset = lostGamesCount / 2;
        }

        double totalPrice = headsetPrice * headset + mousePrice * mouse
                + keyboardPrice * keyboard + displayPrice * display;

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
import java.util.Scanner;

public class U7VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double coins = 0.0;
        String command = scanner.nextLine();
        double totalCoins = 0.0;

        while (!command.equals("Start")){
            coins = Double.parseDouble(command);
            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 &&
                    coins != 2){
                System.out.printf("Cannot accept %.2f\n", coins);
                coins = 0;
            }
            totalCoins += coins;
            command = scanner.nextLine();
        }

        String product = scanner.nextLine();

        while (!product.equals("End")){
            if (!product.equals("Nuts") && !product.equals("Water") &&
                    !product.equals("Crisps") && !product.equals("Soda") &&
                    !product.equals("Coke")){
                System.out.println("Invalid product");
            }
            else if(product.equals("Nuts") && totalCoins < 2 ||
                    product.equals("Water") && totalCoins < 0.7 ||
                    product.equals("Crisps") && totalCoins < 1.5 ||
                    product.equals("Soda") && totalCoins < 0.8 ||
                    product.equals("Coke") && totalCoins < 1){
                System.out.println("Sorry, not enough money");
            }
            else{
                System.out.printf("Purchased %s\n", product);
                switch (product) {
                    case "Nuts": totalCoins -= 2;
                    break;
                    case "Water": totalCoins -= 0.7;
                    break;
                    case "Crisps": totalCoins -= 1.5;
                    break;
                    case "Soda": totalCoins -= 0.8;
                    break;
                    default: totalCoins -= 1;
                }
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalCoins);
    }
}
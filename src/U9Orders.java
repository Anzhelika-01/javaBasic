import java.util.Scanner;

public class U9Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ordersCount = Integer.parseInt(scanner.nextLine());
        double pricePerCapsule = 0.0;
        int days = 0;
        int capsulesCount = 0;
        double totalPrice = 0.0;


        for (int i = ordersCount; i > 0; i--){
            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsulesCount = Integer.parseInt(scanner.nextLine());
            double price = (days * capsulesCount) * pricePerCapsule;
            totalPrice += price;
            System.out.printf("The price for the coffee is: $%.2f\n", price);
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
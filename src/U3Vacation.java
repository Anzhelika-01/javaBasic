import java.util.Scanner;

public class U3Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;
        double totalPrice;

        switch (type){
            case "Students":
                if (day.equals("Friday")){
                    price = 8.45;
                }
                else if (day.equals("Saturday")){
                    price = 9.8;
                }
                else {
                    price = 10.46;
                }
                break;
            case "Business":
                if (day.equals("Friday")){
                    price = 10.9;
                }
                else if (day.equals("Saturday")){
                    price = 15.6;
                }
                else {
                    price = 16;
                }
                break;
            case "Regular":
                if (day.equals("Friday")){
                    price = 15;
                }
                else if (day.equals("Saturday")){
                    price = 20;
                }
                else {
                    price = 22.5;
                }
                break;
        }

        totalPrice = count * price;
        if (type.equals("Students") && count >= 30){
            totalPrice -= totalPrice * 0.15;
        }
        if (type.equals("Business") && count >= 100){
            count -= 10;
            totalPrice = count * price;
        }
        else if (type.equals("Regular") && count >= 10 && count <= 20){
            totalPrice -= totalPrice * 0.05;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
